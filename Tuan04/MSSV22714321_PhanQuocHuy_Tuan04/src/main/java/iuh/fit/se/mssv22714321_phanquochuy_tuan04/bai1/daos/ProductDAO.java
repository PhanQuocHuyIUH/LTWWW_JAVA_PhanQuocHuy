package iuh.fit.se.mssv22714321_phanquochuy_tuan04.bai1.daos;

import iuh.fit.se.mssv22714321_phanquochuy_tuan04.bai1.entities.Product;

import java.util.List;

public interface ProductDAO {
    public List<Product> findAll();
    public Product getById(int id);
    public void addProduct(Product p);
}
