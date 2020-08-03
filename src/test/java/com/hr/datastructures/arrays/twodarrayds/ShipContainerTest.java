package com.hr.datastructures.arrays.twodarrayds;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class ShipContainerTest {

    private final ShipContainer shipContainer = new ShipContainer();
    private final HourglassShape byHourglassShape = createHourglassShape(3, 3);

    //width : 6
    //height: 6
    int[][] containerContent = new int[][]{
            {1, 1, 1, 0, 0, 0,},
            {0, 1, 0, 0, 0, 0,},
            {1, 1, 1, 0, 0, 0,},
            {0, 0, 2, 4, 4, 0,},
            {0, 0, 0, 2, 0, 0,},
            {0, 0, 1, 2, 4, 0,},
    };

    @Test
    public void fill_withContainerContent_shouldBeExpectedContainerContent() {
        //given
        int[][] containerContent = this.containerContent;

        //when
        shipContainer.fill(containerContent);

        //then
        int[][] expectedContainerContent = new int[][]{
                {1, 1, 1, 0, 0, 0,},
                {0, 1, 0, 0, 0, 0,},
                {1, 1, 1, 0, 0, 0,},
                {0, 0, 2, 4, 4, 0,},
                {0, 0, 0, 2, 0, 0,},
                {0, 0, 1, 2, 4, 0,},
        };

        assertThat(shipContainer.getContent(),
                equalTo(expectedContainerContent));

    }

    @Test
    public void fill_withTestContainerContentFile_shouldBeExpectedContainerContent() {
        //given
        String withContainerContentDataFilePath = "src/test/resources/testcontainercontent.data";
        int[][] withContainerFileContent = new Logistic()
                .order(withContainerContentDataFilePath);

        //when
        shipContainer.fill(withContainerFileContent);

        //then
        int[][] expectedContainerContent = new int[][]{
                {1, 1, 1, 0, 0, 0,},
                {0, 1, 0, 0, 0, 0,},
                {1, 1, 1, 0, 0, 0,},
                {0, 0, 2, 4, 4, 0,},
                {0, 0, 0, 2, 0, 0,},
                {0, 0, 1, 2, 4, 0,},
        };

        assertThat(shipContainer.getContent(),
                equalTo(expectedContainerContent));


    }

    @Test
    public void findHourglasses_withContentByHourglassShape_shouldBeExpected() {

        //given
        int[][] withContent = this.containerContent;
        HourglassShape byHourglassShape = this.byHourglassShape;

        //when
        shipContainer.fill(withContent);
        List<Hourglass> hourglassListFound = shipContainer
                .findHourglasses(byHourglassShape);

        int[][] hourglassListFoundFirstElementValues = hourglassListFound
                .get(0)
                .getValues();

        //then
        int[][] expectedValues = new int[][]{
                {1, 1, 1},
                {0, 1, 0},
                {1, 1, 1}
        };

        assertThat(hourglassListFoundFirstElementValues,
                is(equalTo(expectedValues)));

    }

    @Test
    public void findBiggerHourglass_withContentByHourglassShape_shouldBeExpected() {
        //given
        int[][] withContent = this.containerContent;
        HourglassShape byHourglassShape = this.byHourglassShape;

        //when
        shipContainer.fill(withContent);
        Hourglass biggerHourglass = shipContainer.findBiggerHourglass(byHourglassShape);
        int biggerHourglassValue = biggerHourglass.getTotalOfValues();

        //then
        int expectedBiggerHourglassValue = 19;
        assertThat(biggerHourglassValue, is(expectedBiggerHourglassValue));
    }


    private HourglassShape createHourglassShape(int width, int height) {
        return new HourglassShape(width, height, new int[][]{
                {1, 1, 1},
                {0, 1, 0},
                {1, 1, 1}
        });
    }


}
