package com.ecommerce.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "total_amount", nullable = false)
    private float totalAmount;

    @Column(name = "user_id")
    private Long userId; // Ensure there's no other field with the same mapping


    // Getters and Setters
}
