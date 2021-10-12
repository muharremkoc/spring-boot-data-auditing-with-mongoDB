package com.example.springbootmongodbaudit.service;

import com.example.springbootmongodbaudit.dto.UserRequestDTO;
import com.example.springbootmongodbaudit.model.User;

import java.util.List;


public interface UserService {

    User saveUser(UserRequestDTO userRequestDTO);

    User updateUser(String id, UserRequestDTO userRequestDTO);


    void deleteUser(String id);


    List<User> getUsers();
}
