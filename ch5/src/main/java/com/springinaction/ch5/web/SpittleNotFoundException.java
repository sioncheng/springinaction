package com.springinaction.ch5.web;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason="spittle not found")
public class SpittleNotFoundException extends RuntimeException {
}
