package com.springinaction.ch5.web;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AppWideExceptionHandler {

    @ExceptionHandler(Exception.class)
    public String exception() {
        return "error/error";
    }
}
