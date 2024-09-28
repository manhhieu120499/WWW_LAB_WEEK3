package iuh.fit.week_03_lab_vomanhhieu_21097401.fontend.controllers;

import iuh.fit.week_03_lab_vomanhhieu_21097401.backend.data.entities.Product;
import iuh.fit.week_03_lab_vomanhhieu_21097401.backend.data.entities.ProductPrice;
import iuh.fit.week_03_lab_vomanhhieu_21097401.fontend.dto.ProductDTO;
import iuh.fit.week_03_lab_vomanhhieu_21097401.fontend.models.ProductModel;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "Controller", value = "/controller")
public class Controller extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if(action.equalsIgnoreCase("list_products")){
            List<ProductDTO> products = ProductModel.getAllProducts();
            req.setAttribute("products", products);
            req.getRequestDispatcher("views/product.jsp").forward(req, resp);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
