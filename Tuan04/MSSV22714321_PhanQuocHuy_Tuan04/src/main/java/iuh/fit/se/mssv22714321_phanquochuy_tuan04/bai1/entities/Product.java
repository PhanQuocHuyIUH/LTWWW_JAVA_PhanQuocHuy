package iuh.fit.se.mssv22714321_phanquochuy_tuan04.bai1.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private Integer id;
    private String name;
    private Double price;
    private String image;
//
//    // Constructor rỗng
//    public Product() {}
//
//    // Constructor đầy đủ
//    public Product(Integer id, String name, Double price, String image) {
//        this.id = id;
//        this.name = name;
//        this.price = price;
//        this.image = image;
//    }
//
//    // Getter & Setter
//    public Integer getId() { return id; }
//    public void setId(Integer id) { this.id = id; }
//
//    public String getName() { return name; }
//    public void setName(String name) { this.name = name; }
//
//    public Double getPrice() { return price; }
//    public void setPrice(Double price) { this.price = price; }
//
//    public String getImage() { return image; }
//    public void setImage(String image) { this.image = image; }
//
//    @Override
//    public String toString() {
//        return "Product{id=" + id + ", name='" + name + "', price=" + price + ", image='" + image + "'}";
//    }
}
