package com.example.LMS2.exceptions;


public class EmployeeNotFoundException extends NotFoundException {
    public EmployeeNotFoundException(Long id) {
        super("Book with Id: " + id + " is not found.");
    }
}
