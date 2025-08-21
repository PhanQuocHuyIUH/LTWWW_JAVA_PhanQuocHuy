package fit.iuh.se.m07_22714321_phanquochuy_tuan01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "bai1&2", urlPatterns = {"/bai1", "/bai2"})
public class Bai1Bai2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        // Hello
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1 style=\"color: red;\">" + "Bai 1 & Bai 2" + "</h1>");
        out.println("<h2 style=\"color: brown;\">" + "Cài đặt Tomcat Server" + "</h1>");
        out.println("<h2 style=\"color: blue;\">" + "Response trả về dạng: text/html" + "</h1>");
        out.println("</body></html>");
    }
}
