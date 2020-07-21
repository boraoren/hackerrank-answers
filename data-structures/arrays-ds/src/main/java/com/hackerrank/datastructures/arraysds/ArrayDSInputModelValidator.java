package com.hackerrank.datastructures.arraysds;

import com.hackerrank.datastructures.exceptions.ConstraintValidationException;

public class ArrayDSInputModelValidator {


    public ArrayDSInputModelValidator(ArrayDSInputModel arrayDSInputModel) {
        isTotalNumberOfInputValid(arrayDSInputModel.getTotalNumberOfInput());
        isNumberArrayInputValid(arrayDSInputModel.getNumbers());
        isTotalNumberOfInputEqualsToNumbersInputLength(arrayDSInputModel);
    }

    public void isTotalNumberOfInputValid(int totalNumberOfInput)
            throws ConstraintValidationException {

        if (!(totalNumberOfInput >= 1 && totalNumberOfInput <= 1000)) {
            String errorMessage = "Total number of input is not valid, should be between 1 and 1000";
            throw new ConstraintValidationException(errorMessage);
        }

    }

    private void isNumberInputValid(int number)
            throws ConstraintValidationException {

        if (!(number >= 1 && number <= 10000)) {
            String errorMessage = "Number of input is not valid, should be between 1 and 10000";
            throw new ConstraintValidationException(errorMessage);
        }

    }

    public void isNumberArrayInputValid(int[] numberArray)
            throws ConstraintValidationException {

        for (int number : numberArray) {
            isNumberInputValid(number);
        }

    }

    public void isTotalNumberOfInputEqualsToNumbersInputLength(ArrayDSInputModel arrayDSInputModel) {
        if (arrayDSInputModel.getTotalNumberOfInput() != arrayDSInputModel.getNumbers().length) {
            String errorMessage = "Length of string of numbers is not equal to total number of input you enter";
            throw new ConstraintValidationException(errorMessage);
        }
    }

}
