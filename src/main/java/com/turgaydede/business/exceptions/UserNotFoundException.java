package com.turgaydede.business.exceptions;

import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class UserNotFoundException extends RuntimeException{
    private static final String MESSAGE ="User not found";
    public UserNotFoundException(){
        super(MESSAGE);
    }
}
