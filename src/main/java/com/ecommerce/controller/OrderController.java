package com.ecommerce.controller;

import com.ecommerce.entity.Order;
import com.ecommerce.entity.User;
import com.ecommerce.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public List<Order> getUserOrders(Principal principal) {
        User user = getCurrentUser(principal); // Replace this with actual user retrieval logic
        return orderService.getUserOrders(user);
    }

    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        return orderService.createOrder(order);
    }

    // Dummy method to get user (replace with actual logic)
    private User getCurrentUser(Principal principal) {
        return new User(); // Replace this
    }
}
