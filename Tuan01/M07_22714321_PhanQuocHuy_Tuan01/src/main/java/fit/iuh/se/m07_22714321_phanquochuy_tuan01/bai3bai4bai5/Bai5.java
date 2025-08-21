package fit.iuh.se.m07_22714321_phanquochuy_tuan01.bai3bai4bai5;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "bai5", value = "/bai5")
public class Bai5 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/bai5.html").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8"); // xử lý Unicode
        resp.setContentType("text/html;charset=UTF-8");

        // Lấy dữ liệu từ form
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String username = req.getParameter("username");
        String email = req.getParameter("email");
        String facebook = req.getParameter("facebook");
        String bio = req.getParameter("bio");
        // ❌ Không hiển thị password vì yêu cầu bảo mật
        // String password = req.getParameter("password");

        // Xuất dữ liệu ra trình duyệt
        PrintWriter out = resp.getWriter();
        out.println("<html><body style='font-family:Arial;'>");
        out.println("<h2>Thông tin bạn vừa đăng ký</h2>");
        out.println("<p><b>Họ và tên:</b> " + firstName + " " + lastName + "</p>");
        out.println("<p><b>Username:</b> " + username + "</p>");
        out.println("<p><b>Email:</b> " + email + "</p>");
        out.println("<p><b>Facebook:</b> " + facebook + "</p>");
        out.println("<p><b>Giới thiệu:</b> " + bio + "</p>");
        out.println("<hr><a href='/Tuan01/bai5'>Quay lại Form</a>");
        out.println("</body></html>");
    }
}
