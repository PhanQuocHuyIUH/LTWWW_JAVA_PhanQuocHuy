package iuh.fit.se.mssv22714321_phanquochuy_tuan04.bai1.entities;

import lombok.*;

/**
 * @author: QUOC HUY
 * @date: 18/09/2025
 */
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class ItemCart {
    private Product product;
    private Integer quantity;

    public ItemCart() {
    }

    public ItemCart(Product product, Integer quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
