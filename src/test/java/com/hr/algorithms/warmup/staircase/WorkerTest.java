package com.hr.algorithms.warmup.staircase;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class WorkerTest {

    @Test
    public void installStaircase_forScannerWithStringerLengthsIs6AndStepTypeIsStone_shouldBeExpectedStepsViewAndType() {
        //given
        String forStringerLength = "6";
        InputStream inputStream = new ByteArrayInputStream(forStringerLength.getBytes());
        Scanner scanner = new Scanner(inputStream);

        //when
        Worker worker = new Worker();
        StepInput stepInput = new StepInput(scanner, StepType.STONE);
        Staircase staircase = worker.installStaircase(stepInput);

        //then
        String stepsViewAndType = Arrays.toString(staircase.getSteps());
        String expectedStepsViewAndType = Arrays.toString(new Step[]{
                new Step("     #", StepType.STONE),
                new Step("    ##", StepType.STONE),
                new Step("   ###", StepType.STONE),
                new Step("  ####", StepType.STONE),
                new Step(" #####", StepType.STONE),
                new Step("######", StepType.STONE),
        });


        staircase.show();
        assertThat(stepsViewAndType, is(expectedStepsViewAndType));

    }

    @Test
    public void installStaircase_forStringerLengthsIs6AndStepTypeIsStone_shouldBeExpectedStepsViewAndType() {
        //given
        int forStringerLength = 6;

        //when
        Worker worker = new Worker();
        StepInput stepInput = new StepInput(forStringerLength, StepType.STONE);
        Staircase staircase = worker.installStaircase(stepInput);

        //then
        String stepsViewAndType = Arrays.toString(staircase.getSteps());
        String expectedStepsViewAndType = Arrays.toString(new Step[]{
                new Step("     #", StepType.STONE),
                new Step("    ##", StepType.STONE),
                new Step("   ###", StepType.STONE),
                new Step("  ####", StepType.STONE),
                new Step(" #####", StepType.STONE),
                new Step("######", StepType.STONE),
        });


        staircase.show();
        assertThat(stepsViewAndType, is(expectedStepsViewAndType));

    }

}
