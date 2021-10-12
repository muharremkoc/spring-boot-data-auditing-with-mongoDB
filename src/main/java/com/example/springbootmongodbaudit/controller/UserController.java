package com.example.springbootmongodbaudit.controller;

import com.example.springbootmongodbaudit.dto.UserRequestDTO;
import com.example.springbootmongodbaudit.model.User;
import com.example.springbootmongodbaudit.service.UserService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserController {


    final UserService userService;


    @PostMapping("/user")
    public User createUser(@RequestBody UserRequestDTO userRequestDTO){
        return userService.saveUser(userRequestDTO);
    }

    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @PutMapping("/user/{id}")
    public User updateUser(@PathVariable("id") String id, @RequestBody UserRequestDTO userRequestDTO){
        return userService.updateUser(id, userRequestDTO);
    }

    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable("id") String id){
         userService.deleteUser(id);
    }
}
