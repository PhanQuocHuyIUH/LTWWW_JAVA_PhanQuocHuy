package iuh.fit.se.mssv22714321_phanquochuy_tuan05.controller;

import iuh.fit.se.mssv22714321_phanquochuy_tuan05.dao.DienThoaiDAO;
import iuh.fit.se.mssv22714321_phanquochuy_tuan05.dao.NhaCungCapDAO;
import iuh.fit.se.mssv22714321_phanquochuy_tuan05.dao.impl.DienThoaiDAOImpl;
import iuh.fit.se.mssv22714321_phanquochuy_tuan05.dao.impl.NhaCungCapDAOImpl;
import iuh.fit.se.mssv22714321_phanquochuy_tuan05.entity.DienThoai;
import iuh.fit.se.mssv22714321_phanquochuy_tuan05.entity.NhaCungCap;
import iuh.fit.se.mssv22714321_phanquochuy_tuan05.util.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * author: QUOC HUY
 * date: 25/09/2025
 */
@WebServlet("/themsp")
@MultipartConfig
public class DienThoaiFormServlet extends HttpServlet {
    private DienThoaiDAO dienThoaiDAO;
    private NhaCungCapDAO nccDAO;
    private EntityManager em;

    @Override
    public void init() throws ServletException {
        em = JPAUtil.getEntityManager();
        dienThoaiDAO = new DienThoaiDAOImpl(em);
        nccDAO = new NhaCungCapDAOImpl(em);
    }

    @Override
    public void destroy() {
        em.close();
        JPAUtil.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer madt = Integer.parseInt(req.getParameter("madt"));
        String tendt = req.getParameter("tendt");
        Integer namsx = Integer.parseInt(req.getParameter("namsx"));
        String cauhinh = req.getParameter("cauhinh");
        String mancc = req.getParameter("mancc");

        // upload ảnh
        Part filePart = req.getPart("hinhanh");
        String fileName = Paths.get(filePart.getSubmittedFileName()).getFileName().toString();
        String uploadPath = getServletContext().getRealPath("/uploads");
        Files.createDirectories(Paths.get(uploadPath));
        filePart.write(uploadPath + File.separator + fileName);

        // tạo đối tượng
        NhaCungCap ncc = nccDAO.findById(mancc);
        DienThoai dt = new DienThoai(madt, tendt, namsx, cauhinh, fileName, null);
        dt.setNhaCungCap(ncc);

        dienThoaiDAO.save(dt);
        resp.sendRedirect("danhsach");
    }
}