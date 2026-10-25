package com.example.systemdesignproject.model.entity;

import com.example.systemdesignproject.model.dto.RegisterDTO;

public class UserMapper {

    public User toUser(RegisterDTO registerDTO){
        User user = new User();

        user.setName(registerDTO.getUsername());
        user.setEmail(registerDTO.getEmail());
        user.setPassword(registerDTO.getPassword());

        return user;
    }

}
