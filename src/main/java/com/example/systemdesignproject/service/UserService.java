package com.example.systemdesignproject.service;

import com.example.systemdesignproject.exception.UserAlreadyExistsException;
import com.example.systemdesignproject.model.dto.RegisterDTO;
import com.example.systemdesignproject.model.entity.CustomUserPrincipal;
import com.example.systemdesignproject.model.entity.UserEntity;
import com.example.systemdesignproject.model.entity.UserMapper;
import com.example.systemdesignproject.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

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

        UserEntity userEntity = userMapper.toUser(registerDTO);

        if(userRepository.existsByName(userEntity.getName()))
            throw new UserAlreadyExistsException("User already exists");

        userEntity.setPassword(passwordEncoder.encode(registerDTO.getPassword()));

        userRepository.save(userEntity);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserEntity userEntity = userRepository.findByName(username);

        if(userEntity == null){
            throw new UsernameNotFoundException("User does not exist");
        }

        return new CustomUserPrincipal(userEntity);
    }
}
