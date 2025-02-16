package com.oa.fetch_oa.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Map<String, String>> handleException(Exception e) {
        Map<String, String> errors = new HashMap<>();

        HttpStatus status = HttpStatus.BAD_REQUEST;

        if (e instanceof HttpMessageNotReadableException) {
            errors.put("error", "The receipt is invalid.");
        } else if (e instanceof  MethodArgumentNotValidException) {
            ((MethodArgumentNotValidException) e).getBindingResult().getFieldErrors().forEach(error ->
                    errors.put("error", error.getDefaultMessage()));
        } else if (e instanceof NoReceiptFoundException) {
            errors.put("error", e.getMessage());
            status = HttpStatus.NOT_FOUND;
        }

        return ResponseEntity.status(status).body(errors);
    }
}
