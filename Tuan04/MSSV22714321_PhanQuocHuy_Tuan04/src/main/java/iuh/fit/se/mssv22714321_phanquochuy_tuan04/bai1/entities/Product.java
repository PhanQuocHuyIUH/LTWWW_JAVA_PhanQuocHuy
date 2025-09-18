package iuh.fit.se.mssv22714321_phanquochuy_tuan04.bai1.entities;

import lombok.*;

/**
 * @author: QUOC HUY
 * @date: 18/09/2025
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private Integer id;
    private String name;
    private Double price;
    private String image;
}
