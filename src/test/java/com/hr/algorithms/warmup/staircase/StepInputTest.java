package com.hr.algorithms.warmup.staircase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StepInputTest {

    @Test
    public void validate_forStringerLengthIs0_throwsStringerLengthMinimumValidationException(){
        //given
        int forStringerLength = 0;

        //when
        String message = "Stringer Length should be bigger than 0";

        StringerLengthMinimumValidationException constraintValidationException = assertThrows(
                StringerLengthMinimumValidationException.class,
                () -> new StepInput(forStringerLength, StepType.STONE), message
        );

        //then
        assertTrue(constraintValidationException
                .getMessage()
                .contains(message));

    }

    @Test
    public void validate_forStringerLengthIs101_throwsStringerLengthMaximumValidationException(){
        //given
        int forStringerLength = 101;

        //when
        String message = "Stringer Length should be smaller or equals than 100";

        StringerLengthMaximumValidationException constraintValidationException = assertThrows(
                StringerLengthMaximumValidationException.class,
                () -> new StepInput(forStringerLength, StepType.STONE), message
        );

        //then
        assertTrue(constraintValidationException
                .getMessage()
                .contains(message));

    }

}
