package com.hr.algorithms.warmup.simplearraysum;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class EmployeeTest {

    @Test
    public void sumOfDumbbellWeights_withEmployeeAnd6DumbbellsAndItsWeightsInFitnessCenter_shouldBe31() {
        //given
        Employee withEmployee = new Employee();

        int[] withWeights = new int[]{1, 2, 3, 4, 10, 11};

        Room room = new Room();
        room.setDumbbells(6, withWeights);

        FitnessCenter inFitnessCenter = new FitnessCenter(room);

        //when
        int sumOfDumbbellInFitnessCenter = withEmployee.sumOfDumbbellWeights(inFitnessCenter);

        //then
        assertThat(sumOfDumbbellInFitnessCenter, is(31));
    }

}
