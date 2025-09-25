package iuh.fit.se.mssv22714321_phanquochuy_tuan05.dao.impl;

import iuh.fit.se.mssv22714321_phanquochuy_tuan05.dao.DienThoaiDAO;
import iuh.fit.se.mssv22714321_phanquochuy_tuan05.entity.DienThoai;
import iuh.fit.se.mssv22714321_phanquochuy_tuan05.util.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.List;

/**
 * author: QUOC HUY
 * date: 25/09/2025
 */
public class DienThoaiDAOImpl implements DienThoaiDAO {
    private EntityManager em;

    public DienThoaiDAOImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<DienThoai> findAll() {
        List<DienThoai> list = em.createQuery("SELECT d FROM DienThoai d", DienThoai.class).getResultList();
//        em.close();
        return list;
    }

    @Override
    public DienThoai findById(String id) {
        DienThoai dt = em.find(DienThoai.class, id);
//        em.close();
        return dt;
    }

    @Override
    public void save(DienThoai dt) {
        try {
            em.getTransaction().begin();
            em.persist(dt);
            em.getTransaction().commit();
        } finally {
//            em.close();
        }
    }

    @Override
    public void delete(String id) {
        try {
            em.getTransaction().begin();
            DienThoai dt = em.find(DienThoai.class, id);
            if (dt != null) em.remove(dt);
            em.getTransaction().commit();
        } finally {
//            em.close();
        }
    }

    @Override
    public List<DienThoai> findByNhaCungCap(String mancc) {
        TypedQuery<DienThoai> q = em.createQuery(
                "SELECT d FROM DienThoai d WHERE d.nhaCungCap.maNCC = :mancc", DienThoai.class);
        q.setParameter("mancc", mancc);
        List<DienThoai> list = q.getResultList();
//        em.close();
        return list;
    }
}
