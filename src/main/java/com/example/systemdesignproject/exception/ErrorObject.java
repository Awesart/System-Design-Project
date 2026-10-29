package com.example.systemdesignproject.exception;

import java.time.Instant;

public class ErrorObject {
    public int errorCode;
    public String message;
    public Instant timestamp;

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }
}
