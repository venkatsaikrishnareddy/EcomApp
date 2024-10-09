package com.ecommerce.entity;

import jakarta.persistence.*;

@Entity
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Product product;

    private int quantity;

    public void setUser(User user) {
    }

    public void setProduct(Product productNotFound) {
    }

    public void setQuantity(int quantity) {

    }

    // Getters and Setters
}
