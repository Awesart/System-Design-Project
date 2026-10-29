package com.example.systemdesignproject.exception;

public class UserNotFoundException extends RuntimeException {
    public final int errorCode = 2;

    public UserNotFoundException(String message) {
        super(message);
    }
}
