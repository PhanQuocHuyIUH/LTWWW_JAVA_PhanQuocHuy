package iuh.fit.se.mssv22714321_phanquochuy_tuan05.dao.impl;

import iuh.fit.se.mssv22714321_phanquochuy_tuan05.dao.NhaCungCapDAO;
import iuh.fit.se.mssv22714321_phanquochuy_tuan05.entity.NhaCungCap;
import iuh.fit.se.mssv22714321_phanquochuy_tuan05.util.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.List;

/**
 * author: QUOC HUY
 * date: 25/09/2025
 */
public class NhaCungCapDAOImpl implements NhaCungCapDAO {
    private EntityManager em;

    public NhaCungCapDAOImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<NhaCungCap> findAll() {
        List<NhaCungCap> list = em.createQuery("SELECT n FROM NhaCungCap n", NhaCungCap.class).getResultList();
//        em.close();
        return list;
    }

    @Override
    public NhaCungCap findById(String id) {
        NhaCungCap ncc = em.find(NhaCungCap.class, id);
//        em.close();
        return ncc;
    }

    @Override
    public List<NhaCungCap> search(String keyword) {
        TypedQuery<NhaCungCap> q = em.createQuery(
                "SELECT n FROM NhaCungCap n WHERE n.tenNCC LIKE :kw " +
                        "OR n.diaChi LIKE :kw OR n.soDienThoai LIKE :kw", NhaCungCap.class);
        q.setParameter("kw", "%" + keyword + "%");
        List<NhaCungCap> list = q.getResultList();
//        em.close();
        return list;
    }
}
