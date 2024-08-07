package com.example.LMS2.exceptions;

public class InsufficientVacationBalanceException extends RuntimeException {
    public InsufficientVacationBalanceException(String insufficientVacationBalance) {
        super(insufficientVacationBalance);
    }
}
