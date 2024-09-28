package iuh.fit.week_03_lab_vomanhhieu_21097401.backend.data.repositories;

import iuh.fit.week_03_lab_vomanhhieu_21097401.backend.data.entities.ProductPrice;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.List;

public class ProductPriceRepository {
    @PersistenceContext
    private EntityManager em;

    public boolean addProductPrice(ProductPrice productPrice) {
        try{
            em.getTransaction().begin();
            em.persist(productPrice);
            em.getTransaction().commit();
        }catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public ProductPrice findProductPriceActive(long id) {
        return em.createNamedQuery("ProductPrice.findByProduct_IdAndState", ProductPrice.class)
                .setParameter("id", id)
                .setParameter("state", (byte) 1)
                .getSingleResult();
    }

    public boolean deleteProductPrice(long id) {
        try{
            ProductPrice p = em.find(ProductPrice.class, id);
            em.getTransaction().begin();
            em.remove(p);
            em.getTransaction().commit();
        }catch (Exception e) {
            e.printStackTrace();
            return  false;
        }
        return true;
    }

    public boolean updateProductPrice(ProductPrice productPrice) {
        try{
            em.getTransaction().begin();
            em.merge(productPrice);
            em.getTransaction().commit();
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public List<ProductPrice> getAllPriceOfProduct(long pid) {
        return em.createNamedQuery("ProductPrice.findByProduct_Id", ProductPrice.class).setParameter("id", pid).getResultList();
    }

}
