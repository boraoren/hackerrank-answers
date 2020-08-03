package com.hr.datastructures.arrays.twodarrayds;

public class Hourglass {

    private final HourglassShape shape;
    private int[][] values;

    public Hourglass(HourglassShape shape) {
        this.shape = shape;
    }

    public void setValues(int[][] values) {
        this.values = values;
    }

    public int[][] getValues() {
        return values;
    }

    public int getTotalOfValues() {
        int totalOfValues = 0;

        for (int y = 0; y < shape.getHeight(); y++) {
            for (int x = 0; x < shape.getWidth(); x++) {
                if (!shape.isFormSuitable(y, x)) {
                    totalOfValues += values[y][x];
                }
            }
        }

        return totalOfValues;
    }

}
