package controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.apache.commons.beanutils.BeanUtils;
import repository.CuaHangRepository;

import java.io.IOException;

@WebServlet({
        "/cuahang/index", //GET
        "/cuahang/create", //GET
        "/cuahang/store", //POST
        "/cuahang/edit", //GET
        "/cuahang/update", //POST
        "/cuahang/delete", //GET
})
public class CuaHangServlet extends HttpServlet {

    private CuaHangRepository cuaHangRepository;

    public CuaHangServlet() {
        cuaHangRepository = new CuaHangRepository();
    }

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.contains("create")) {
            create(request, response);
        } else if (uri.contains("edit")) {
            edit(request, response);
        } else if (uri.contains("delete")) {
            delete(request, response);
        } else {
            this.index(request, response);
        }
    }

    protected void index(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("DSCuaHang", this.cuaHangRepository.findAll());
        request.setAttribute("view", "/views/cuahang/index.jsp");
        request.getRequestDispatcher("/views/layout.jsp").forward(request, response);
    }

    protected void create(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("view", "/views/cuahang/create.jsp");
        request.getRequestDispatcher("/views/layout.jsp").forward(request, response);
    }

    protected void edit(HttpServletRequest request,
                        HttpServletResponse response)
            throws ServletException, IOException {
        String ma = request.getParameter("ma");
        CuaHangDomain cuaHangDomain = this.cuaHangRepository.findByMa(ma);
        request.setAttribute("ch", cuaHangDomain);
        request.setAttribute("view", "/views/cuahang/edit.jsp");
        request.getRequestDispatcher("/views/layout.jsp").forward(request, response);
    }

    protected void delete(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {
        String ma = request.getParameter("ma");
        CuaHangDomain ch = this.cuaHangRepository.findByMa(ma);
        this.cuaHangRepository.delete(ch);
        response.sendRedirect("/../cuahang/index");
    }

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.contains("update")) {
            update(request, response);
        } else if (uri.contains("store")) {
            store(request, response);
        } else {
            this.index(request, response);
        }
    }

    protected void store(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            CuaHangDomain chdm = new CuaHangDomain();
            BeanUtils.populate(chdm, request.getParameterMap());
            this.cuaHangRepository.insert(chdm);
        } catch (Exception e) {
            e.printStackTrace();
        }
        response.sendRedirect("/../cuahang/index");
    }

    protected void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String ma = request.getParameter("ma");
            CuaHangDomain chdm = this.cuaHangRepository.findByMa(ma);
            BeanUtils.populate(chdm, request.getParameterMap());
            this.cuaHangRepository.update(chdm);
        } catch (Exception e) {
            e.printStackTrace();
        }
        response.sendRedirect("/../cuahang/index");
    }

}
