package com.rest.springbasicapi.controller;

import com.rest.springbasicapi.model.User;
import com.rest.springbasicapi.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UserController {


    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/save")
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @GetMapping("/find")
    public Optional<User> getUserById(@RequestParam Long id){
        return userService.getUserById(id);
    }

    @GetMapping("/all")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }


    @PutMapping("/update")
    public Optional<User> updateUserById(@RequestParam Long id, @RequestBody User user){
        return Optional.ofNullable(userService.updateUserById(id, user));
    }
}
