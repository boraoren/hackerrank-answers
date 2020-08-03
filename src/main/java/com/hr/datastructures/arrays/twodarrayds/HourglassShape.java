package com.hr.datastructures.arrays.twodarrayds;

public class HourglassShape {

    private final int width;
    private final int height;
    private final int[][] form;

    /**
     *
     * for instance;
     *
     *  hourglass width is 3
     *  hourglass height is 3
     *
     *  hourglass shape form is
     *  1   1   1
     *  0   1   0
     *  1   1   1
     *
     *  0 means, shape form does not include 0s
     *  so the form is logically
     *  1   1   1
     *      1
     *  1   1   1
     *
     * let's apply hourglass shape form to
     * ship container fill item.
     *
     * ship container fill item is
     *  9   2   3
     *  5   2   8
     *  7   3   6
     *
     * if you apply hourglass shape form
     * to ship container fill item
     * you will see in logically
     *  9   2   3
     *      2
     *  7   3   6
     *
     * you will not take in to account 5 and 8
     *  9   2   3
     * [5]  2  [8]
     *  7   3   6
     *
     * in short,
     *  0 means exclude
     *  1 means include
     * for hourglass shape form
     *
     */
    public HourglassShape(int width, int height, int[][] form) {
        this.width = width;
        this.height = height;
        this.form = form;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean isFormSuitable(int y, int x) {
        return form[y][x] != 1;
    }
}
