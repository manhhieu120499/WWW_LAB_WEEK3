package iuh.fit.week_03_lab_vomanhhieu_21097401.backend.business;

import iuh.fit.week_03_lab_vomanhhieu_21097401.backend.data.entities.Product;
import iuh.fit.week_03_lab_vomanhhieu_21097401.backend.data.entities.ProductPrice;
import iuh.fit.week_03_lab_vomanhhieu_21097401.backend.data.repositories.ProductPriceRepository;
import iuh.fit.week_03_lab_vomanhhieu_21097401.backend.data.repositories.ProductRepository;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

import java.util.List;

@Stateless
public class ProductBean implements ProductLocal{
    @Inject
    private ProductRepository productRepository;
    @Inject
    ProductPriceRepository productPriceRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }

    @Override
    public Product findProduct(long id) {
        return productRepository.findProduct(id);
    }

    @Override
    public boolean addProduct(Product product) {
        return productRepository.addProduct(product);
    }

    @Override
    public boolean updateProduct(Product product) {
        return productRepository.updateProduct(product);
    }

    @Override
    public boolean deleteProduct(long id) {
        return productRepository.deleteProduct(id);
    }

    @Override
    public ProductPrice getProductPrice(long id) {
        return productPriceRepository.findProductPriceActive(id);
    }
}
