package com.ankita.oauth.controller;

import com.ankita.oauth.dto.UserProfileResponse;
import com.ankita.oauth.entity.User;
import com.ankita.oauth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {

    @Autowired
    private UserService userService;

    @GetMapping("/profile")
    public UserProfileResponse profile(Authentication authentication) {

        String email = authentication.getName();

        User user = userService.findByEmail(email);

        return new UserProfileResponse(
                user.getName(),
                user.getEmail(),
                user.getRole()
        );
    }
}