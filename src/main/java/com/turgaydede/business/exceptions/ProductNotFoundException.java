package com.turgaydede.business.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ProductNotFoundException extends RuntimeException {
    private static final String MESSAGE = "Product Not Found";
    public ProductNotFoundException(){
        super(MESSAGE);
    }
}
