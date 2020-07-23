package com.common.exceptions;

public class ConstraintValidationException extends RuntimeException {
    public ConstraintValidationException(String errorMessage) {
        super(errorMessage);
    }
}
