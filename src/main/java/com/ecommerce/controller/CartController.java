package com.ecommerce.controller;

import com.ecommerce.entity.CartItem;
import com.ecommerce.entity.User;
import com.ecommerce.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/api/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @GetMapping
    public List<CartItem> getUserCart(Principal principal) {
        User user = getCurrentUser(principal); // Replace this with actual user retrieval logic
        return cartService.getUserCart(user);
    }

    @PostMapping("/{productId}")
    public CartItem addToCart(Principal principal, @PathVariable Long productId, @RequestParam int quantity) {
        User user = getCurrentUser(principal); // Replace this with actual user retrieval logic
        return cartService.addToCart(user, productId, quantity);
    }

    @DeleteMapping("/{cartItemId}")
    public void removeFromCart(@PathVariable Long cartItemId) {
        cartService.removeFromCart(cartItemId);
    }

    // Dummy method to get user (replace with actual logic)
    private User getCurrentUser(Principal principal) {
        return new User(); // Replace this
    }
}
