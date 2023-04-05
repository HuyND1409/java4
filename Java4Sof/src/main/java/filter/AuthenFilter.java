package filter;

import domain_model.NhanVienDomain;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebFilter(filterName = "AuthenFilter")
public class AuthenFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request,
                         ServletResponse response,
                         FilterChain chain)
            throws ServletException, IOException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse repo = (HttpServletResponse) response;
        HttpSession session = req.getSession();
        NhanVienDomain nv = (NhanVienDomain)  session.getAttribute("nv");
        if(nv == null){
            repo.sendRedirect("/../login.jsp");
        }else {
            chain.doFilter(req,repo);
        }
    }
}
