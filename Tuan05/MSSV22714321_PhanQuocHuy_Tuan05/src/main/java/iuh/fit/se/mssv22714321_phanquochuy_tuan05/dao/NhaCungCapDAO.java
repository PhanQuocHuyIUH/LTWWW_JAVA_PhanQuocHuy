package iuh.fit.se.mssv22714321_phanquochuy_tuan05.dao;

import iuh.fit.se.mssv22714321_phanquochuy_tuan05.entity.NhaCungCap;

import java.util.List;

/**
 * author: QUOC HUY
 * date: 25/09/2025
 */
public interface NhaCungCapDAO {
    List<NhaCungCap> findAll();
    NhaCungCap findById(String id);
    List<NhaCungCap> search(String keyword);
}
