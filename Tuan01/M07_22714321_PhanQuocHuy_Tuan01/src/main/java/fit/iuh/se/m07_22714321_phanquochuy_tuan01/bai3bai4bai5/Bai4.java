package fit.iuh.se.m07_22714321_phanquochuy_tuan01.bai3bai4bai5;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "bai4", value = "/bai4",  initParams = {
        @WebInitParam(name = "text", value = "This page will display user information"),
})
public class Bai4 extends HttpServlet {
    private User u;
    private String text;

    @Override
    public void init(ServletConfig config) throws ServletException {
        u = User.toUser(config.getServletContext().getInitParameter("demoUserJson"));
        text = config.getInitParameter("text");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1 style=\"color: red;\">" + "Bai 4" + "</h1>");
        out.println("<h2 style=\"color: blue;\">" + "Khai báo và sử dụng init-param" + "</h1>");
        out.println("<h1 style=\"color: green;\">" + text + "</h1>");
        out.println("<h2 style=\"color: blue;\">" + "Khai báo và sử dụng context-param" + "</h1>");
        out.println("<h1 style=\"color: green;\">" + u.toString() + "</h1>");
        out.println("</body></html>");
    }
}
