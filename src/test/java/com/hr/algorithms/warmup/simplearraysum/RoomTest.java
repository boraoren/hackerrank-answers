package com.hr.algorithms.warmup.simplearraysum;

import com.common.exceptions.ConstraintValidationException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RoomTest {

    @Test
    public void setDumbbells_withSizeOfDumbbellIs6AndWeightSizeAre3And_throwsConstraintValidationException() {
        //given
        int withSizeOfDumbbell = 6;
        int[] withWeights = new int[]{1,2,3};
        String message = "Size of dumbbells and its weights are not equal.";

        //when
        Room room = new Room();
        ConstraintValidationException constraintValidationException = assertThrows(
                ConstraintValidationException.class,
                () -> room.setDumbbells(withSizeOfDumbbell, withWeights),
                message
        );

        //then
        assertTrue(constraintValidationException
                .getMessage()
                .contains(message));

    }

    @Test
    public void setDumbbells_withSizeOfDumbbellIs1001AndWeightSizeAre1001_throwsConstraintValidationException() {
        //given
        int withSizeOfDumbbell = 1001;
        int[] withWeights = dummyWeights(withSizeOfDumbbell);
        String message = "Size of dumbbells should be 0 > and <= 1000";

        //when
        Room room = new Room();
        ConstraintValidationException constraintValidationException = assertThrows(
                ConstraintValidationException.class,
                () -> room.setDumbbells(withSizeOfDumbbell, withWeights),
                message
        );

        //then
        assertTrue(constraintValidationException
                .getMessage()
                .contains(message));

    }

    private int[] dummyWeights(int withSizeOfDumbbell){
        int[] withWeights = new int[withSizeOfDumbbell];
        for(int index = 0; index < withWeights.length; index++){
            withWeights[index] = index;
        }

        return withWeights;
    }
}
