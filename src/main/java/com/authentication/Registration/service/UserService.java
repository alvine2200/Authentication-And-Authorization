package com.authentication.Registration.service;


import com.authentication.Registration.entity.User;
import com.authentication.Registration.model.UserModel;

public interface UserService {
    public User registerUser(UserModel userModel);
}
