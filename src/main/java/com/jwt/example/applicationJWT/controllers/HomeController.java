package com.jwt.example.applicationJWT.controllers;

import com.jwt.example.applicationJWT.entity.User;
import com.jwt.example.applicationJWT.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {
    @Autowired
    private UserService userService;
    @GetMapping("/users")
    public List<User> getUser()
    {
        return userService.GetUsers();
    }

    @GetMapping("/current-user")
    public String GetLoggedInUser(Principal principal)
    {
        return principal.getName();
    }

}
