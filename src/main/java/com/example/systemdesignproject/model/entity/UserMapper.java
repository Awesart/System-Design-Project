package com.example.systemdesignproject.model.entity;

import com.example.systemdesignproject.model.dto.RegisterDTO;

import java.util.List;


public class UserMapper {

    public UserEntity toUser(RegisterDTO registerDTO){
        UserEntity userEntity = new UserEntity();

        userEntity.setName(registerDTO.getUsername());
        userEntity.setEmail(registerDTO.getEmail());
        userEntity.setPassword(registerDTO.getPassword());
        userEntity.setRoles(List.of(Role.USER));

        return userEntity;
    }

}
