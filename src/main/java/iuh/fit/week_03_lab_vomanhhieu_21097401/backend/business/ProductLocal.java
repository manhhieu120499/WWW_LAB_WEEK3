package iuh.fit.week_03_lab_vomanhhieu_21097401.backend.business;

import iuh.fit.week_03_lab_vomanhhieu_21097401.backend.data.entities.Product;
import iuh.fit.week_03_lab_vomanhhieu_21097401.backend.data.entities.ProductPrice;
import jakarta.ejb.Local;

import java.util.List;

@Local
public interface ProductLocal {
    public List<Product> getAllProducts();
    public Product findProduct(long id);
    public boolean addProduct(Product product);
    public boolean updateProduct(Product product);
    public boolean deleteProduct(long id);
    public ProductPrice getProductPrice(long id);
}
