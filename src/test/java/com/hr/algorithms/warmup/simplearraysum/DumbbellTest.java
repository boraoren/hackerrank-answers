package com.hr.algorithms.warmup.simplearraysum;

import com.common.exceptions.ConstraintValidationException;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DumbbellTest {

    @Test
    public void setWeight_withDumbbellWeightIs1001_throwsConstraintValidationException() {
        //given
        int withDumbbellWeight = 1001;

        //when
        String message = "Weight of dumbbell is not valid, should be > 0 and <= 1000";
        ConstraintValidationException constraintValidationException = assertThrows(
                ConstraintValidationException.class,
                () -> new Dumbbell().setWeight(withDumbbellWeight),
                message
        );


        //then
        assertTrue(constraintValidationException
                .getMessage()
                .contains(message));

    }

    @Test
    public void setWeight_withDumbbellWeightIsMinus1_throwsConstraintValidationException() {
        //given
        int withDumbbellWeight = -1;

        //when
        String message = "Weight of dumbbell is not valid, should be > 0 and <= 1000";
        ConstraintValidationException constraintValidationException = assertThrows(
                ConstraintValidationException.class,
                () -> new Dumbbell().setWeight(withDumbbellWeight),
                message
        );


        //then
        assertTrue(constraintValidationException
                .getMessage()
                .contains(message));

    }

    @Test
    public void setWeight_withDumbbellWeightIs1000_shouldBe1000() {
        //given
        Dumbbell dumbbell = new Dumbbell();
        int withDumbbellWeight = 1000;

        //when
        dumbbell.setWeight(withDumbbellWeight);

        //then
        assertThat(dumbbell.getWeight(), is(1000));

    }

}
