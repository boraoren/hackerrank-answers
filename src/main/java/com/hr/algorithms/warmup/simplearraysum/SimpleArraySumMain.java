package com.hr.algorithms.warmup.simplearraysum;

import com.util.StringUtil;

import java.io.IOException;
import java.util.Scanner;

public class SimpleArraySumMain {

    /**
     * There is a fitness center.
     * There is a room in the fitness center.
     * There are a lot of Dumbbells
     * with different weights in the room
     * <p>
     * There is employee who is responsible
     * to sum dumbbells in a room
     * in the fitness center.
     */

    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) throws IOException {

        FitnessCenter fitnessCenter = new FitnessCenter();
        Room room = new Room();
        fitnessCenter.setRoom(room);

        int totalNumberOfDumbbells = insertTotalNumberOfDumbbells();
        int[] withDifferentWeights = insertWeightOfDumbbell();
        room.setDumbbells(totalNumberOfDumbbells, withDifferentWeights);

        Employee employee = new Employee();
        int sumOfDumbbellWeights = employee.sumOfDumbbellWeights(fitnessCenter);

        System.out.printf("Sum Of Dumbbells Weight is %s", sumOfDumbbellWeights);

    }

    private static int insertTotalNumberOfDumbbells() {
        int totalNumberOfDumbbells = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        return totalNumberOfDumbbells;
    }

    private static int[] insertWeightOfDumbbell() {
        final StringUtil stringUtil = new StringUtil();
        String stringOfWeightOfDumbbells = scanner.nextLine();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        return stringUtil.convertStringToNumbers(stringOfWeightOfDumbbells);
    }

}
