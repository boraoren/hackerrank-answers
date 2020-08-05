package com.hr.datastructures.arrays.arrayds;

import com.util.StringUtil;

import java.util.Scanner;

public class ArrayDSMain {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayDSInputModel arrayDSInputModel =
                new ArrayDSInputModel(ArrayDSMain.insertTotalNumberOfInput(),
                        ArrayDSMain.insertNumbers());

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
