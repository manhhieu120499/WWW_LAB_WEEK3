package iuh.fit.week_03_lab_vomanhhieu_21097401.backend.data.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "product_price")
@NamedQueries({
        @NamedQuery(name = "ProductPrice.findByProduct_Id", query = "select p from ProductPrice p where p.product.id = :id"),
        @NamedQuery(name = "ProductPrice.findByProduct_IdAndState", query = "select p from ProductPrice p where p.product.id = :id and p.state = :state")
})
public class ProductPrice implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "price_id", nullable = false)
    private Long id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @NotNull
    @Column(name = "value", nullable = false)
    private Double value;

    @NotNull
    @Column(columnDefinition = "DATETIME", name = "apply_date", nullable = false)
    private LocalDateTime applyDate;

    @Size(max = 250)
    @Column(name = "note", length = 250)
    private String note;

    @NotNull
    @Column(name = "state", nullable = false)
    private Byte state;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public LocalDateTime getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(LocalDateTime applyDate) {
        this.applyDate = applyDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public ProductPrice(Product product, Double value, LocalDateTime applyDate, String note, Byte state) {
        this.product = product;
        this.value = value;
        this.applyDate = applyDate;
        this.note = note;
        this.state = state;
    }

    public ProductPrice() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductPrice that = (ProductPrice) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "ProductPrice{" +
                "id=" + id +
                ", product=" + product +
                ", value=" + value +
                ", applyDate=" + applyDate +
                ", note='" + note + '\'' +
                ", state=" + state +
                '}';
    }
}