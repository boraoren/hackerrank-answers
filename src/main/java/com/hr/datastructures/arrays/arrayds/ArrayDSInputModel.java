package com.hr.datastructures.arrays.arrayds;

public class ArrayDSInputModel {

    private final int totalNumberOfInput;
    private final int[] numbers;

    public ArrayDSInputModel(int totalNumberOfInput,
                             int[] numbers) {

        this.totalNumberOfInput = totalNumberOfInput;
        this.numbers = numbers;

        new ArrayDSInputModelValidator(this);
    }

    public int getTotalNumberOfInput() {
        return totalNumberOfInput;
    }

    public int[] getNumbers() {
        return numbers;
    }

}
