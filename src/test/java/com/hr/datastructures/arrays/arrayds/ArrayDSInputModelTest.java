package com.hr.datastructures.arrays.arrayds;


import com.common.exceptions.ConstraintValidationException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArrayDSInputModelTest {

    @Test
    public void isTotalNumberOfInputValid_withTotalNumberOfInput1001_throwsConstraintValidationException() {

        int totalNumberOfInput = 1001;

        String message = "Total number of input is not valid, should be between 1 and 1000";

        ConstraintValidationException constraintValidationException = assertThrows(
                ConstraintValidationException.class,
                () -> new ArrayDSInputModel(
                        totalNumberOfInput,
                        null),
                message
        );

        assertTrue(constraintValidationException
                .getMessage()
                .contains(message));


    }

    @Test
    public void isNumberArrayInputValid_withNumberArrayAre1_20000_5_7_throwsConstraintValidationException() {

        int[] numberArray = new int[]{1, 20000, 5, 7};

        String message = "Number of input is not valid, should be between 1 and 10000";

        ConstraintValidationException constraintValidationException = assertThrows(
                ConstraintValidationException.class,
                () -> new ArrayDSInputModel(
                        4,
                        numberArray),
                message
        );

        assertTrue(constraintValidationException
                .getMessage()
                .contains(message));

    }

    @Test
    public void isTotalNumberOfInputEqualsToNumbersInputLength_withTotalNumberOfInput100AndStringOfNumbersAre_1_4_3_2_throwsConstraintException() {

        String message = "Length of string of numbers is not equal to total number of input you enter";

        ConstraintValidationException constraintValidationException = assertThrows(
                ConstraintValidationException.class,
                () -> new ArrayDSInputModel(
                        100,
                        new int[]{1, 4, 3, 2}),
                message
        );

        assertTrue(constraintValidationException
                .getMessage()
                .contains(message));

    }

}
