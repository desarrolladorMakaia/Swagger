package com.firstapi.myfirstapi.controller;

import com.firstapi.myfirstapi.model.User;
import com.firstapi.myfirstapi.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/v1/users")
public class UserController {

    private final UserServiceI userServiceI;

    public UserController(UserServiceI userServiceI){
        this.userServiceI = userServiceI;
    }

    @GetMapping
    public HashMap<Integer, User> all(){
        return userServiceI.all();
    }

    @GetMapping("/{idUser}")
    public User findById(@PathVariable("idUser") Integer id){
        return userServiceI.findById(id);
    }

    @PostMapping
    public User createUser(@RequestBody User user){
        return userServiceI.createUser(user);
    }

    @PutMapping("/{idUser}")
    public User updateUser(@PathVariable("idUser") Integer id, @RequestBody User user){
        return userServiceI.updateUser(id, user);
    }

    @DeleteMapping("/{idUser}")
    public void deleteUser(@PathVariable("idUser") Integer id){
        userServiceI.deleteUser(id);
    }
}
