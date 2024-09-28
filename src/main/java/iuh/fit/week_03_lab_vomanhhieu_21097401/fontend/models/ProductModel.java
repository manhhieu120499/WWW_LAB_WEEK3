package iuh.fit.week_03_lab_vomanhhieu_21097401.fontend.models;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import iuh.fit.week_03_lab_vomanhhieu_21097401.backend.data.entities.Product;
import iuh.fit.week_03_lab_vomanhhieu_21097401.backend.data.entities.ProductPrice;
import iuh.fit.week_03_lab_vomanhhieu_21097401.fontend.dto.ProductDTO;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;

import java.util.ArrayList;
import java.util.List;

public class ProductModel {
    private static final String BASEURI = "http://localhost:8080/week_03_lab_VoManhHieu_21097401-1.0-SNAPSHOT/api";
    public static List<ProductDTO> getAllProducts() {
        List<ProductDTO> productList = new ArrayList<>();
        Client client = ClientBuilder.newBuilder().build();
        WebTarget target1 = client.target(BASEURI).path("/products");
        String jsonProducts = target1.request("application/json")
                .get().readEntity(String.class);
        ObjectMapper mapper = new ObjectMapper();
        try {
            Product[] products = mapper.readValue(jsonProducts, Product[].class);

            for (Product product : products) {
                ProductPrice productPrice = getProductPrice(product.getId());
                productList.add(
                        new ProductDTO(product.getId(), product.getName(), product.getDescription(), product.getImgPath(), productPrice.getValue())
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return productList;
    }

    public static ProductPrice getProductPrice(long id) throws JsonProcessingException {
        Client client = ClientBuilder.newBuilder().build();
        WebTarget target = client.target(BASEURI).path("/products/price/" + id);
        String jsonProductPrice = target.request("application/json")
                .get().readEntity(String.class);
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        return mapper.readValue(jsonProductPrice, ProductPrice.class);
    }
}
