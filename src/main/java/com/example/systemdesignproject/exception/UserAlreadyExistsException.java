package com.example.systemdesignproject.exception;

public class UserAlreadyExistsException extends RuntimeException {

    public final int errorCode = 1;
    private final int status;

    UserAlreadyExistsException(
            String message,
            int status
    ){
        super(message);
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

}
