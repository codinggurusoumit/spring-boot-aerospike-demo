package com.aerospike.demo.controller;

import com.aerospike.demo.object.User;
import com.aerospike.demo.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@AllArgsConstructor
public class UserController {

    UserService userService;
    @GetMapping("/users/{id}")
    public Optional<User> readUserById(@PathVariable("id") Integer id) {
        return userService.readUserById(id);
    }
    @PostMapping("/users")
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }
    @DeleteMapping("/users/{id}")
    public void deleteUserById(@PathVariable("id") Integer id) {
        userService.removeUserById(id);
    }
}
