package com.example.systemdesignproject.exception;

public class UserAlreadyExistsException extends RuntimeException {

    public final int errorCode = 1;

    public UserAlreadyExistsException(
            String message
    ){
        super(message);
    }

}
