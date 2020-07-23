package com.hr.datastructures.arrays.arraysds;

import java.util.Arrays;

public class StringUtil {
    public int[] convertStringToNumbers(String stringOfNumbers) {
        return Arrays
                .stream(stringOfNumbers
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
