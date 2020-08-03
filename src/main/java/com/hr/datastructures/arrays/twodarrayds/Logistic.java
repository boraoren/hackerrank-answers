package com.hr.datastructures.arrays.twodarrayds;

import com.util.FileUtils;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Logistic {

    public int[][] order(String containerContentPath) {
        Path path = Paths.get(containerContentPath);
        return FileUtils.convertFileTo2DArray(path);
    }

    public int[][] order(Scanner byScanner, int height, int width){

        int[][] contentContainer = new int[height][width];

        for (int h = 0; h < height; h++) {
            String[] arrRowItems = byScanner.nextLine().split(" ");
            byScanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int w = 0; w < width; w++) {
                int arrItem = Integer.parseInt(arrRowItems[w]);
                OrderValidator.isValid(arrItem);
                contentContainer[h][w] = arrItem;

            }
        }
        return contentContainer;

    }

}
