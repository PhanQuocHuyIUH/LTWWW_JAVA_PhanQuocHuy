package iuh.fit.se.mssv22714321_phanquochuy_tuan02.bai1;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;
import java.io.PrintWriter;

@WebFilter("/bai1")
public class AuthFilter implements Filter {
    private String validUser;
    private String validPassword;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        validUser = filterConfig.getServletContext().getInitParameter("username");
        validPassword = filterConfig.getServletContext().getInitParameter("password");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String username = servletRequest.getParameter("username");
        String password = servletRequest.getParameter("password");

        // Nếu chưa submit form -> cho qua để hiển thị login.html
        if (username == null || password == null) {
            filterChain.doFilter(servletRequest, servletResponse);
            return;
        }

        if (validUser.equals(username) && validPassword.equals(password)) {
            // Cho phép request đi tiếp tới LoginServlet
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            // Trả về lỗi ngay tại Filter
            servletResponse.setContentType("text/html;charset=UTF-8");
            PrintWriter out = servletResponse.getWriter();
            out.println("<h2 style='color:red;'>❌ Invalid username or password!</h2>");
            out.println("<a href='login.html'>Back to Login</a>");
        }
    }

    @Override
    public void destroy() {
//        Filter.super.destroy();
    }
}
