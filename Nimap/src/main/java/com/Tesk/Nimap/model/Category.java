package com.Tesk.Nimap.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generate unique ID
    private Long categoryId; // Primary key

    private String categoryName;

    // One category can have multiple products (OneToMany)
    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Product> categoryProducts;

    // Getters and Setters

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<Product> getCategoryProducts() {
        return categoryProducts;
    }

    public void setCategoryProducts(List<Product> categoryProducts) {
        this.categoryProducts = categoryProducts;
    }
}

