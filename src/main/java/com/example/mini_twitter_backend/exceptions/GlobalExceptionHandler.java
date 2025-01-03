package com.example.mini_twitter_backend.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler
    private ResponseEntity<ExceptionErrorResponse> exceptionHandler(TwitterException exception){
        ExceptionErrorResponse response = new ExceptionErrorResponse(exception.getStatus(), exception.getMessage(), System.currentTimeMillis());
        return new ResponseEntity<>(response,exception.getStatus());
    }

    @ExceptionHandler
    private ResponseEntity<ExceptionErrorResponse> globalExceptionHandler(Exception exception){
        ExceptionErrorResponse response = new ExceptionErrorResponse(HttpStatus.BAD_REQUEST,exception.getMessage(),System.currentTimeMillis());
        return new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
    }
}
