package com.example.systemdesignproject.controller;

import com.example.systemdesignproject.model.dto.RegisterDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/auth")
public class AuthController {

    //Need Login Function
    //Need Register Function

    @RequestMapping("/register")
    public ResponseEntity<String> register(
            @RequestBody RegisterDTO registerDTO
            ){


        return new ResponseEntity<>("Success!",HttpStatus.OK);
    }


}
