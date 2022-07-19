package com.tmax.ai.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.net.http.HttpResponse;

@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(CustomException.class)
    ResponseEntity handleCustomException(CustomException e) { // protected 필요?
        ResponseEntity response = new ResponseEntity(e.getMessage(), e.getErrorCode().getStatus());
        return response;
    }

}
