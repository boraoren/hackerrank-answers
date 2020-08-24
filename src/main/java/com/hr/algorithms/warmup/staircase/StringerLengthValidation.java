package com.hr.algorithms.warmup.staircase;

public class StringerLengthValidation {

    public boolean validateMin(int stringerLength) {
        if (!(stringerLength > 0)) {
            String errorMessage = "Stringer Length should be bigger than 0";
            throw new StringerLengthMinimumValidationException(errorMessage);
        }

        return true;
    }

    public boolean validateMax(int stringerLength) {
        if (!(stringerLength <= 100)) {
            String errorMessage = "Stringer Length should be smaller or equals than 100";
            throw new StringerLengthMaximumValidationException(errorMessage);
        }

        return true;
    }

    public boolean validate(int stringerLength) {
        validateMin(stringerLength);
        validateMax(stringerLength);
        return true;
    }



}
