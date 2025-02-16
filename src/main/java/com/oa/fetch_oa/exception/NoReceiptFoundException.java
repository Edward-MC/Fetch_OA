package com.oa.fetch_oa.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NoReceiptFoundException extends RuntimeException {
    public NoReceiptFoundException(String message) {
        super(message);
    }
}

