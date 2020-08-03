package com.hr.datastructures.arrays.arrayds;

public class ArrayDS {

    public String reverseOrder(ArrayDSInputModel arrayDSInputModel) {
        int totalNumberOfInput = arrayDSInputModel.getTotalNumberOfInput();
        int[] numbers = arrayDSInputModel.getNumbers();
        return reverseOrder(totalNumberOfInput, numbers);
    }

    public String reverseOrder(int totalNumberOfInput, int[] numbers) {

        for (int i = 0; i < totalNumberOfInput / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[totalNumberOfInput - i - 1];
            numbers[totalNumberOfInput - i - 1] = temp;
        }

        StringBuilder stringBuilder = new StringBuilder();
        String spaceSeparator = " ";
        stringBuilder.append(numbers[0]);

        for (int i = 1; i < numbers.length; i++) {
            stringBuilder.append(spaceSeparator).append(numbers[i]);
        }

        return stringBuilder.toString();
    }

}
