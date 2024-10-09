package com.ecommerce.controller;

import com.ecommerce.dto.UserDto;
import com.ecommerce.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ecommerce.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String registerUser(@RequestBody UserDto userDto) {
        // Call the service method with the userDto instance
        return userService.registerUser(userDto);
    }

    @PostMapping("/login")
    public String loginUser(@RequestParam String username, @RequestParam String password) {
        User user = userService.loginUser(username, password);
        return user != null ? "Login Successful" : "Invalid Credentials";
    }
}
