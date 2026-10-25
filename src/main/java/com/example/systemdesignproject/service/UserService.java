package com.example.systemdesignproject.service;

import com.example.systemdesignproject.model.dto.RegisterDTO;
import com.example.systemdesignproject.model.entity.User;
import com.example.systemdesignproject.model.entity.UserMapper;
import com.example.systemdesignproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {

    private UserRepository userRepository;

    UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }


    public void saveUser(RegisterDTO registerDTO){
        UserMapper userMapper = new UserMapper();

        User userEntity = userMapper.toUser(registerDTO);

        userRepository.save(userEntity);
    }

}
