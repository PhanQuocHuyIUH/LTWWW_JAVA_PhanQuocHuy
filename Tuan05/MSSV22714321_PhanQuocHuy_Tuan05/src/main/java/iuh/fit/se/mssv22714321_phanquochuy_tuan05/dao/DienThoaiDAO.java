package iuh.fit.se.mssv22714321_phanquochuy_tuan05.dao;

import iuh.fit.se.mssv22714321_phanquochuy_tuan05.entity.DienThoai;

import java.util.List;

/**
 * author: QUOC HUY
 * date: 25/09/2025
 */
public interface DienThoaiDAO {
    List<DienThoai> findAll();
    DienThoai findById(String id);
    void save(DienThoai dt);
    void delete(String id);
    List<DienThoai> findByNhaCungCap(String mancc);
}
