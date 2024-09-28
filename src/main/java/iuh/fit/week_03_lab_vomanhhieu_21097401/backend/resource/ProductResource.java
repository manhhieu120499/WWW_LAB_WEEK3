package iuh.fit.week_03_lab_vomanhhieu_21097401.backend.resource;

import iuh.fit.week_03_lab_vomanhhieu_21097401.backend.business.ProductLocal;
import iuh.fit.week_03_lab_vomanhhieu_21097401.backend.data.entities.Product;
import iuh.fit.week_03_lab_vomanhhieu_21097401.backend.data.entities.ProductPrice;
import jakarta.ejb.EJB;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/products")
public class ProductResource {
    @EJB
    private ProductLocal productLocal;

    @GET
    @Produces("application/json")
    public List<Product> getAllProducts() {
        return productLocal.getAllProducts();
    }

    @GET
    @Path("/{id}")
    @Produces("application/json")
    public Product findProduct(@PathParam("id") long id) {
        return productLocal.findProduct(id);
    }

    @GET
    @Path("/price/{id}")
    @Produces("application/json")
    public ProductPrice productPrice(@PathParam("id") long id) {
        return productLocal.getProductPrice(id);
    }
}
