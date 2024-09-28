package iuh.fit.week_03_lab_vomanhhieu_21097401.backend.data.repositories;

import iuh.fit.week_03_lab_vomanhhieu_21097401.backend.data.entities.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;


public class ProductRepository {
    @PersistenceContext(name = "my_pu")
    private EntityManager em;

    public boolean addProduct(Product product) {
        try{
            em.getTransaction().begin();
            em.persist(product);
            em.getTransaction().commit();
        }catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public Product findProduct(long id) {
        return em.find(Product.class, id);
    }

    public boolean deleteProduct(long id) {
        try{
            Product p = em.find(Product.class, id);
            em.getTransaction().begin();
            em.remove(p);
            em.getTransaction().commit();
        }catch (Exception e) {
            e.printStackTrace();
            return  false;
        }
        return true;
    }

    public boolean updateProduct(Product product) {
        try{
            em.getTransaction().begin();
            em.merge(product);
            em.getTransaction().commit();
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public List<Product> getAllProducts() {
        return em.createNamedQuery("Product.findAll", Product.class).getResultList();
    }
}
