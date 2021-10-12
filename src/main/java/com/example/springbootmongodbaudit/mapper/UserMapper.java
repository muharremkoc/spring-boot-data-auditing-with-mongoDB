package com.example.springbootmongodbaudit.mapper;

import com.example.springbootmongodbaudit.dto.UserRequestDTO;
import com.example.springbootmongodbaudit.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface UserMapper {


    @Mapping(target = "firstName",source = "firstName")
    User userDTOtoUser(UserRequestDTO userRequestDTO);

}
