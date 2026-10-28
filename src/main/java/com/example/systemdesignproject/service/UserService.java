package com.example.systemdesignproject.service;

import com.example.systemdesignproject.model.dto.RegisterDTO;
import com.example.systemdesignproject.model.entity.User;
import com.example.systemdesignproject.model.entity.UserMapper;
import com.example.systemdesignproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

public class UserService {

    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;

    UserService(
            UserRepository userRepository,
            PasswordEncoder passwordEncoder
            ){
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public void saveUser(RegisterDTO registerDTO){
        UserMapper userMapper = new UserMapper();

        User userEntity = userMapper.toUser(registerDTO);

        userEntity.setPassword(passwordEncoder.encode(registerDTO.getPassword()));

        userRepository.save(userEntity);
    }

}
