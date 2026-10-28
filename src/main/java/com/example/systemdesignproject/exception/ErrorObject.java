package com.example.systemdesignproject.exception;

import java.time.Instant;

public class ErrorObject {
    public int errorCode;
    public int status;
    public String message;
    public Instant timestamp;

    public void setStatus(int status) {
        this.status = status;
    }

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
