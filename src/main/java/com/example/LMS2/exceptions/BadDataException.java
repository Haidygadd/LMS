package com.example.LMS2.exceptions;

public class BadDataException extends RuntimeException {
    public BadDataException(String detail) {
        super(detail);
    }
}