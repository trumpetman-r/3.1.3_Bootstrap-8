package com.webcrudsecurityboot.service;

import com.webcrudsecurityboot.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(Long id);
    User getUserByEmail(String email);
    void saveUser(User user);
    void updateUser(User user);
    void deleteUserById(Long id);
}