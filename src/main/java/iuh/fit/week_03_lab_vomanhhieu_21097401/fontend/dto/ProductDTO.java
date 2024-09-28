package iuh.fit.week_03_lab_vomanhhieu_21097401.fontend.dto;

public class ProductDTO {
    private Long id;
    private String name;
    private String description;
    private String imgPath;
    private Double price;

    public ProductDTO(Long id, String name, String description, String imgPath, Double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.imgPath = imgPath;
        this.price = price;
    }

    public ProductDTO(Long id, String name, String description, String imgPath) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.imgPath = imgPath;
    }

    public ProductDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ProductDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", imgPath='" + imgPath + '\'' +
                ", price=" + price +
                '}';
    }
}
