package iuh.fit.se.mssv22714321_phanquochuy_tuan05.controller;

import iuh.fit.se.mssv22714321_phanquochuy_tuan05.dao.DienThoaiDAO;
import iuh.fit.se.mssv22714321_phanquochuy_tuan05.dao.impl.DienThoaiDAOImpl;
import iuh.fit.se.mssv22714321_phanquochuy_tuan05.entity.DienThoai;
import iuh.fit.se.mssv22714321_phanquochuy_tuan05.util.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

/**
 * author: QUOC HUY
 * date: 25/09/2025
 */
@WebServlet("/danhsach")
public class DanhSachDienThoaiNCCServlet extends HttpServlet {
    private DienThoaiDAO dienThoaiDAO;
    private EntityManager em;

    @Override
    public void init() throws ServletException {
        em = JPAUtil.getEntityManager();
        dienThoaiDAO = new DienThoaiDAOImpl(em);
    }

    @Override
    public void destroy() {
        em.close();
        JPAUtil.close();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<DienThoai> list = dienThoaiDAO.findAll();
        req.setAttribute("listDT", list);
        req.getRequestDispatcher("/DanhSachDienThoaiNCC.jsp").forward(req, resp);
    }
}