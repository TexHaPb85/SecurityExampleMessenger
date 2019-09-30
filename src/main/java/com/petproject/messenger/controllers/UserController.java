package com.petproject.messenger.controllers;


import com.petproject.messenger.entities.User;
import com.petproject.messenger.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

        @Autowired
        private UserService userService;

        @GetMapping()
        public List<User> getAllUsers(){
            return userService.findAllUsers();
        }

        @PostMapping()
        public User createUser(@RequestBody User user){
            return userService.addNewUser(user);
        }

        @DeleteMapping()
        public void deleteMessage(@RequestBody User user){
            userService.deleteUser(user);
        }

        @PutMapping("/{id}")
        public User editUserById(@RequestBody User user, @PathVariable("id") Long id){
            return userService.editUserById(user,id);
        }
}
