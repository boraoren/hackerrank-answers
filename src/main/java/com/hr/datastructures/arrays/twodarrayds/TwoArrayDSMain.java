package com.hr.datastructures.arrays.twodarrayds;

import java.util.Scanner;

public class TwoArrayDSMain {

    /**
     * I ordered container content from logistic
     * My container content shape is hourglass
     * My hourglass shape is 3x3 matrix (width is 3, height is 3)
     * My hourglass shape form is
     * 1   1   1
     * 0   1   0
     * 1   1   1
     * 1 means is included
     * 0 means is excluded
     * <p>
     * I have a ship container
     * I fill my ship container with ordered container content
     * <p>
     * I want to find bigger hourglass in that ship container
     * So that I can see total values of bigger hourglass that contains
     *
     */

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Logistic logistic = new Logistic();
        int[][] containerContent = logistic.order(scanner, 6,6);
        // you can play with file
        //int[][] containerContent = new Logistic().order("src/main/resources/containercontent.data");

        int shapeWidth = 3;
        int shapeHeight = 3;
        int[][] shapeForm = new int[][]{
                {1, 1, 1},
                {0, 1, 0},
                {1, 1, 1},
        };

        HourglassShape hourglassShape = new HourglassShape(shapeWidth, shapeHeight, shapeForm);
        ShipContainer shipContainer = new ShipContainer();
        shipContainer.fill(containerContent);
        Hourglass hourglassFound = shipContainer.findBiggerHourglass(hourglassShape);
        System.out.println(hourglassFound.getTotalOfValues());

        scanner.close();

    }


}
