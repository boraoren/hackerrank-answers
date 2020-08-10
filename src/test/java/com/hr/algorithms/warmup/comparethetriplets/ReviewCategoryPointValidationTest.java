package com.hr.algorithms.warmup.comparethetriplets;

import com.common.exceptions.ConstraintValidationException;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ReviewCategoryPointValidationTest {

    @Test
    public void isValidForMaximumLimit_withDeveloperRate_shouldBeTrue() {
        //given
        int withDeveloperRate = 100;

        //when
        boolean isValidForMaximumLimit = ReviewCategoryPointValidation.isValidForMaximumLimit(withDeveloperRate);

        //then
        assertThat(isValidForMaximumLimit, is(true));
    }

    @Test
    public void isValidForMaximumLimit_withDeveloperRate_throwsConstraintValidationException() {
        //given
        int withDeveloperRate = 101;

        //when
        String message = "Developer rate's category point is not valid, maximum value must be smaller than 101";

        ConstraintValidationException constraintValidationException = assertThrows(
                ConstraintValidationException.class,
                () -> ReviewCategoryPointValidation.isValidForMaximumLimit(withDeveloperRate),
                message
        );

        //then
        assertTrue(constraintValidationException
                .getMessage()
                .contains(message));

    }

    @Test
    public void isValidForMinimumLimit_withDeveloperRate_shouldBeTrue() {
        //given
        int withDeveloperRate = 1;

        //when
        boolean isValidForMaximumLimit = ReviewCategoryPointValidation.isValidForMinimumLimit(withDeveloperRate);

        //then
        assertThat(isValidForMaximumLimit, is(true));
    }

    @Test
    public void isValidForMinimumLimit_withDeveloperRate_throwsConstraintValidationException() {
        //given
        int withDeveloperRate = 0;

        //when
        String message = "Developer rate's category point is not valid, minimum value must be bigger than 0";

        ConstraintValidationException constraintValidationException = assertThrows(
                ConstraintValidationException.class,
                () -> ReviewCategoryPointValidation.isValidForMinimumLimit(withDeveloperRate),
                message
        );

        //then
        assertTrue(constraintValidationException
                .getMessage()
                .contains(message));

    }

}
