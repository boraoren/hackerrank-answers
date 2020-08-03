package com.hr.datastructures.arrays.twodarrayds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ShipContainer {

    private int[][] content;

    public int[][] getContent() {
        return content;
    }

    public void fill(int[][] content) {
        this.content = content;
    }

    public List<Hourglass> findHourglasses(HourglassShape hourglassShape) {

        List<Hourglass> hourglassList = new ArrayList<>();

        for (int containerY = 0; containerY <= hourglassShape.getHeight(); containerY++) {
            for (int containerX = 0; containerX <= hourglassShape.getWidth(); containerX++) {
                Hourglass hourglassFound = findHourglass(hourglassShape,
                        containerY,
                        containerX);
                hourglassList.add(hourglassFound);
            }
        }
        return hourglassList;
    }

    private Hourglass findHourglass(HourglassShape hourglassShape, int containerY, int containerX) {
        int[][] values = new int[hourglassShape.getWidth()][hourglassShape.getWidth()];

        for (int height = 0; height < hourglassShape.getHeight(); height++) {
            for (int width = 0; width < hourglassShape.getWidth(); width++) {
                values[height][width] = content[height + containerY][width + containerX];
            }
        }

        Hourglass hourglass = new Hourglass(hourglassShape);
        hourglass.setValues(values);
        return hourglass;
    }

    public Hourglass findBiggerHourglass(HourglassShape byHourglassShape) {
        List<Hourglass> hourglassList = findHourglasses(byHourglassShape);
        return Collections.max(hourglassList,
                Comparator.comparing(Hourglass::getTotalOfValues));
    }
}
