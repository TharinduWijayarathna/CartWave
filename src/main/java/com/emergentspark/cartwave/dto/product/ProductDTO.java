package com.emergentspark.cartwave.dto.product;

import lombok.Data;

@Data
public class ProductDTO {
    private String name;
    private String description;
    private String category;
    private int quantity;
    private double price;
}
