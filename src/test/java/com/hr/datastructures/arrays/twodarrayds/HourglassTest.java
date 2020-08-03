package com.hr.datastructures.arrays.twodarrayds;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class HourglassTest {

    private final int[][] withTestValues = {
            {1, 1, 1},
            {2, 1, 0},
            {1, 1, 1}
    };

    private final HourglassShape withShape =
            new HourglassShape(3, 3, new int[][]{
                    {1, 1, 1},
                    {0, 1, 0},
                    {1, 1, 1}
            });

    @Test
    public void getTotalOfValues_withShapeAndValues_shouldBe7() {

        //given
        Hourglass hourglass = new Hourglass(withShape);
        hourglass.setValues(withTestValues);

        //when
        int totalOfValues = hourglass.getTotalOfValues();

        //then
        int expectedTotalOfValues = 7;
        assertThat(totalOfValues, is(expectedTotalOfValues));

    }

}
