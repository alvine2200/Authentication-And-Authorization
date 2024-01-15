package com.authentication.Registration.controller;

import com.authentication.Registration.entity.User;
import com.authentication.Registration.model.UserModel;
import com.authentication.Registration.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String registerUser(@RequestBody UserModel userModel)
    {
        User user=userService.registerUser(userModel);
        return "User Created Successfully";
    }
}
