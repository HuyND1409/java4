package controller;

import domain_model.NhanVienDomain;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import repository.NhanVienRepository;

import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    NhanVienRepository nhanVienRepository = new NhanVienRepository();
    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("view", "login.jsp");
        request.getRequestDispatcher("/views/layout.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {
        String ma = request.getParameter("ma");
        String matKhau = request.getParameter("matKhau");
        NhanVienDomain nv = this.nhanVienRepository.login(ma , matKhau);
        HttpSession ses = request.getSession();
        if( nv == null){
            ses.setAttribute("errorMessege" , "Sai tên đăng nhập hoặc Mật Khẩu");
            response.sendRedirect("/../login.jsp");
        }else {
            ses.setAttribute("nv",nv);
            response.sendRedirect("/../khachhang/index");
        }

        }
}
