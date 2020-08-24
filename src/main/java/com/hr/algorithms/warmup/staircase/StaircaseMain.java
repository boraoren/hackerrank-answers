package com.hr.algorithms.warmup.staircase;

import java.util.Scanner;

public class StaircaseMain {

    /**
     * 1. I am a worker.
     * 2. I want to install flagstone staircase.
     * 3. So that, I can show staircase to the customer when it is done.
     */

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //1
        Worker worker = new Worker();
        StepInput stepInput = new StepInput(scanner, StepType.STONE);
        //2
        Staircase staircase = worker.installStaircase(stepInput);
        //3
        staircase.show();
    }

}
