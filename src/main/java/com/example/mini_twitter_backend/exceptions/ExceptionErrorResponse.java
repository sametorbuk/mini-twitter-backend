package com.example.mini_twitter_backend.exceptions;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class ExceptionErrorResponse {
    private String message;
    private int status;
    private long timeStamps;

    public ExceptionErrorResponse(HttpStatus status, String message, long timeStamps) {
        this.status = status.value();
        this.message = message;
        this.timeStamps = timeStamps;
    }
}
