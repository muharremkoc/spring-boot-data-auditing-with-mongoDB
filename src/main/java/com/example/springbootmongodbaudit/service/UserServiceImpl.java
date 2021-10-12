package com.example.springbootmongodbaudit.service;

import com.example.springbootmongodbaudit.dto.UserRequestDTO;
import com.example.springbootmongodbaudit.mapper.UserMapper;
import com.example.springbootmongodbaudit.model.User;
import com.example.springbootmongodbaudit.repository.UserRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserServiceImpl implements UserService{

    final UserRepository userRepository;

    final UserMapper userMapper;

    @Override
    public User saveUser(UserRequestDTO userRequestDTO) {
        User user=userMapper.userDTOtoUser(userRequestDTO);
        return userRepository.save(user);
    }

    @Override
    public User updateUser(String id, UserRequestDTO userRequestDTO) {
        User user=userRepository.findById(id).orElseThrow();
        user.setFirstName(userRequestDTO.getFirstName());
        return user;
    }

    @Override
    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }
}
