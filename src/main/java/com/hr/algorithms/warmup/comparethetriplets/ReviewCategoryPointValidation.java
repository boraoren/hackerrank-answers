package com.hr.algorithms.warmup.comparethetriplets;

import com.common.exceptions.ConstraintValidationException;

public class ReviewCategoryPointValidation {

    public static boolean isValid(int categoryPoint) throws ConstraintValidationException{

        isValidForMinimumLimit(categoryPoint);
        isValidForMaximumLimit(categoryPoint);

        return true;
    }

    public static boolean isValidForMaximumLimit(int categoryPoint) throws ConstraintValidationException{

        if (categoryPoint > 100) {
            throw new ConstraintValidationException("Developer rate's category point is not valid, maximum value must be smaller than 101");
        }

        return true;

    }

    public static boolean isValidForMinimumLimit(int categoryPoint) throws ConstraintValidationException{
        if(categoryPoint < 1){
           throw new ConstraintValidationException("Developer rate's category point is not valid, minimum value must be bigger than 0");
        }

        return true;
    }
}
