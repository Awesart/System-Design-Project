package com.example.systemdesignproject.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(UserAlreadyExistsException.class)
    public ResponseEntity<ErrorObject> handleUserAlreadyExistsException(
            UserAlreadyExistsException ex
    ){
        ErrorObject error = new ErrorObject();
        error.setErrorCode(ex.errorCode);
        error.setMessage(ex.getMessage());
        error.setTimestamp(Instant.now());

        return new ResponseEntity<>(error, HttpStatus.CONFLICT);
    }

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<ErrorObject> handleUserNotFoundException(
            UserNotFoundException ex
    ){
        ErrorObject error = new ErrorObject();
        error.setErrorCode(ex.errorCode);
        error.setMessage(ex.getMessage());
        error.setTimestamp(Instant.now());

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

}
