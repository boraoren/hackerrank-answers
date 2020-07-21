package com.hackerrank.datastructures.arraysds;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class ArrayDSTest {

    private final ArrayDS arrayDs = new ArrayDS();

    @Test
    public void reverseOrder_withTotalNumberOfInput4AndStringOfNumbersAre_1_4_3_2_shouldBe2_3_4_1() {

        ArrayDSInputModel arrayDSInputModel = new ArrayDSInputModel(
                4,
                new int[]{1,4,3,2});

        String expectedReverseOrderOfNumbers = "2 3 4 1";
        assertThat(arrayDs.reverseOrder(arrayDSInputModel),
                containsString(expectedReverseOrderOfNumbers));
    }

}
