package com.firstapi.myfirstapi.service;

import com.firstapi.myfirstapi.model.User;

import java.util.HashMap;

public interface UserServiceI {
    HashMap<Integer, User> all();
    User findById(Integer id);
    User createUser(User user);
    User updateUser(Integer id, User user);
    void deleteUser(Integer id);
}
