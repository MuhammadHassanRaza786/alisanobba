package com.alisanobba.alisanobba;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="E_commerce_cart")
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public Product(String productImg, String productName, String shortDescription, String longDescription,
            Double productPrice) {
        this.productImg = productImg;
        this.productName = productName;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.productPrice = productPrice;
    }
    public Product(Long myId, String myName, String longDescription2, String shortdesc, double price) {
    }
    @Column(name="product_image",columnDefinition="Text")
    private String productImg;
    @Column(name="product_name")
    private String productName;
    @Column(name="product_short_description",columnDefinition="Text")
    private String shortDescription;
    @Column(name="product_long_description",columnDefinition="Text")
    private String longDescription;
    @Column(name = "product_price")
    private Double productPrice;
  
    
}
