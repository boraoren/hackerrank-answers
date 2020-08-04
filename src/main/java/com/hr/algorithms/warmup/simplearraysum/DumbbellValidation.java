package com.hr.algorithms.warmup.simplearraysum;

import com.common.exceptions.ConstraintValidationException;

public class DumbbellValidation {

    public static void validateWeight(int weight) throws ConstraintValidationException{
        if(!(weight > 0 && weight <=1000)){
            String errorMessage = "Weight of dumbbell is not valid, should be > 0 and <= 1000";
            throw new ConstraintValidationException(errorMessage);
        }
    }

    public static void validateDumbbells(int sizeOfDumbbells, int[] withWeights){
        if(sizeOfDumbbells!= withWeights.length){
            String errorMessage = "Size of dumbbells and its weights are not equal.";
            throw new ConstraintValidationException(errorMessage);
        }
    }


    public static void validateSizeOfDumbbells(int sizeOfDumbbells) {
        if(!(sizeOfDumbbells > 0 && sizeOfDumbbells <=1000)){
            String errorMessage = "Size of dumbbells should be 0 > and <= 1000";
            throw new ConstraintValidationException(errorMessage);
        }
    }
}
