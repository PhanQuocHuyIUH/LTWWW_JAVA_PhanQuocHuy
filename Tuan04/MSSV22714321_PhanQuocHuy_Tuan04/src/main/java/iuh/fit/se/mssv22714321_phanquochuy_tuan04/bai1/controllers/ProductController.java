package iuh.fit.se.mssv22714321_phanquochuy_tuan04.bai1.controllers;

import iuh.fit.se.mssv22714321_phanquochuy_tuan04.bai1.daos.ProductDAO;
import iuh.fit.se.mssv22714321_phanquochuy_tuan04.bai1.daos.impl.ProductDAOImpl;
import jakarta.annotation.Resource;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import javax.sql.DataSource;
import java.io.IOException;

@WebServlet(name = "productController", urlPatterns = "/products")
public class ProductController extends HttpServlet {
    @Resource(name = "jdbc/shoppingdb")
    private DataSource dataSource;

    private ProductDAO productDAO;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        this.productDAO = new ProductDAOImpl(dataSource);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("products", productDAO.findAll());
        req.getRequestDispatcher("views/product/index.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }

//    private void createProduct() {
//        List<Product> products = List.of(
//                new Product("Product 1", 50000, "image1.png"),
//                new Product("Product 2", 20000, "image2.png"),
//                new Product("Product 3", 40000, "image3.jpeg"),
//                new Product("Product 4", 80000, "image4.jpeg"),
//                new Product("Product 5", 100000, "image5.png")
//        );
//
//        products.forEach(productDAO::addProduct);
//    }
}
