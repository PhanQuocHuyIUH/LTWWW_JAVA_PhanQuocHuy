package fit.iuh.se.m07_22714321_phanquochuy_tuan01.bai3bai4bai5;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "bai3", value = "/bai3")
public class Bai3 extends HttpServlet {

    private User u;
    @Override
    public void init(ServletConfig config) throws ServletException {
        u = new User("u01", "u@01", "u01@gmail.com", 21, "123456789");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json");

        // Hello
        PrintWriter out = resp.getWriter();
        out.println(u.toJson());
    }
}
