package com.spring.restapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class DivisionByZeroException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public DivisionByZeroException(String exception) {
        super(exception);
    }
}
