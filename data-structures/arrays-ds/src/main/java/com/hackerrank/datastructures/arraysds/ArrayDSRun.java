package com.hackerrank.datastructures.arraysds;

import java.util.Scanner;

public class ArrayDSRun {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayDSInputModel arrayDSInputModel =
                new ArrayDSInputModel(ArrayDSRun.insertTotalNumberOfInput(),
                        ArrayDSRun.insertNumbers());

        ArrayDS arrayDS = new ArrayDS();
        String reversedNumbers = arrayDS
                .reverseOrder(arrayDSInputModel);

        System.out.println(reversedNumbers);

    }

    private static int insertTotalNumberOfInput() {
        int totalNumberOfInput = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        return totalNumberOfInput;
    }

    private static int[] insertNumbers() {
        final StringUtil stringUtil = new StringUtil();
        String stringOfNumbers = scanner.nextLine();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        return stringUtil.convertStringToNumbers(stringOfNumbers);
    }

}
