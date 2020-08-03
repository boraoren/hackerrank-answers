package com.hr.datastructures.arrays.arrayds;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class StringUtilTest {

    @Test
    public void convertStringToNumbers_ForString1432BetweenSpace_shouldBeIntegerArrayOf1432() {
        StringUtil stringUtil = new StringUtil();

        String stringOfNumbers = "1 4 3 2";
        int[] expectedNumbers = {1, 4, 3, 2};

        assertThat(stringUtil
                        .convertStringToNumbers(stringOfNumbers),
                is(expectedNumbers));
    }

}
