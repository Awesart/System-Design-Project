package com.example.systemdesignproject.controller;

import com.example.systemdesignproject.model.dto.LoginDTO;
import com.example.systemdesignproject.model.dto.RegisterDTO;
import com.example.systemdesignproject.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/auth")
public class AuthController {

    private UserService userService;
    private AuthenticationManager authenticationManager;

    AuthController(
            UserService userService,
            AuthenticationManager authenticationManager
    ){
        this.userService = userService;
        this.authenticationManager = authenticationManager;
    }

    //Need Login Function
    //Need Register Function

    @PostMapping("/login")
    public ResponseEntity<String> login(
            @RequestBody LoginDTO loginDTO
            ){

        Authentication usernamePasswordAuthenticationToken = UsernamePasswordAuthenticationToken.unauthenticated(loginDTO.getUsername(), loginDTO.getPassword());

        //TODO: Figure out what to do with authentication object
        //Most likely will use it to generate JWT token.
        Authentication authentication = authenticationManager.authenticate(usernamePasswordAuthenticationToken);

        return new ResponseEntity<>("Success", HttpStatus.OK);
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(
            @RequestBody RegisterDTO registerDTO
            ){

        userService.saveUser(registerDTO);

        return new ResponseEntity<>("Success!",HttpStatus.OK);
    }


}
