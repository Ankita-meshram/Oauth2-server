package com.ankita.oauth.controller;

import com.ankita.oauth.config.JwtUtil;
import com.ankita.oauth.dto.LoginRequest;
import com.ankita.oauth.entity.User;
import com.ankita.oauth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ankita.oauth.dto.RegisterRequest;
import com.ankita.oauth.dto.JwtResponse;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String register(@RequestBody RegisterRequest request) {

        User user = new User();
        user.setName(request.getName());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());

        userService.register(user);

        return "User Registered Successfully";
    }

    @PostMapping("/login")
    public JwtResponse login(@RequestBody LoginRequest request) {

        User user = userService.findByEmail(request.getEmail());

        if (user == null) {
            throw new RuntimeException("User not found");
        }

        if (!userService.checkPassword(request.getPassword(), user.getPassword())) {
            throw new RuntimeException("Invalid Password");
        }

        String token = JwtUtil.generateToken(user.getEmail());

        return new JwtResponse(token);
    }
}