package iuh.fit.se.mssv22714321_phanquochuy_tuan04.bai1.daos;

import iuh.fit.se.mssv22714321_phanquochuy_tuan04.bai1.entities.Product;

import java.util.List;

public interface ProductDAO {
     List<Product> findAll();
     Product getById(Integer id);
     void addProduct(Product p);
}
