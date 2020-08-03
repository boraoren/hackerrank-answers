package com.hr.datastructures.arrays.twodarrayds;

import com.common.exceptions.ConstraintValidationException;

public class OrderValidator {

    public static void isValid(int input) {
        if (!(input >= -9 && input <= 9)) {
            throw new ConstraintValidationException("input " + input + " must be bigger than -9 and smaller than 9");
        }
    }

}
