package com.hackerrank.datastructures.exceptions;

public class ConstraintValidationException extends RuntimeException {
    public ConstraintValidationException(String errorMessage) {
        super(errorMessage);
    }
}
