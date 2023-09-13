package com.firstapi.myfirstapi.service;

import com.firstapi.myfirstapi.model.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class UserService implements UserServiceI{

    HashMap<Integer, User> userData = new HashMap<>();

    @Override
    public HashMap<Integer, User> all() {
        return userData;
    }

    @Override
    public User findById(Integer id) {
        return userData.get(id);
    }

    @Override
    public User createUser(User user) {
        Integer key = user.getIdUser();
        return userData.put(key,user);
    }

    @Override
    public User updateUser(Integer id, User user) {
        return userData.put(id, user);
    }

    @Override
    public void deleteUser(Integer id) {
        userData.remove(id);
    }
}
