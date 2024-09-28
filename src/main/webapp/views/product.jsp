<%@ page import="iuh.fit.week_03_lab_vomanhhieu_21097401.fontend.dto.ProductDTO" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Mạnh Hiếu
  Date: 9/22/2024
  Time: 3:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Product</title>
</head>
<body>
    <h2>List Product</h2>
    <%
        List<ProductDTO> products = (List<ProductDTO>) request.getAttribute("products");
        out.println("<table border='1' width='100%'>");
        out.println("<tr>");
        out.println("<th>Product ID</th>");
        out.println("<th>Product Name</th>");
        out.println("<th>Description</th>");
        out.println("<th>Image Path</th>");
        out.println("<th>Price</th>");
        out.println("</tr>");
        for (ProductDTO product : products) {
            out.println("<td>" + product.getId() + "</td>");
            out.println("<td>" + product.getName() + "</td>");
            out.println("<td>" + product.getDescription() + "</td>");
            out.println("<td>" + product.getImgPath() + "</td>");
            out.println("<td>" + product.getPrice() + "</td>");
            out.println("</tr>");
        }
        out.println("</table>");
    %>
</body>
</html>
