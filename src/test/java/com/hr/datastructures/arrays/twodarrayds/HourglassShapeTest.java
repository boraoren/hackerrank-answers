package com.hr.datastructures.arrays.twodarrayds;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class HourglassShapeTest {

    @Test
    public void isFormSuitable_withWidthAndHeightAndFormAndYAndX_shouldBeExpected() {
        //given
        int withWidth = 3;
        int withHeight = 3;
        int[][] withForm = new int[][]{
                {1, 1, 1},
                {0, 1, 0},
                {1, 1, 1},
        };

        HourglassShape hourglassShape = new HourglassShape(withWidth,
                withHeight,
                withForm);

        int withY = 1;
        int withX = 0;

        //when
        boolean formSuitable = hourglassShape.isFormSuitable(withY, withX);

        //then
        assertThat(formSuitable, is(true));
    }

}
