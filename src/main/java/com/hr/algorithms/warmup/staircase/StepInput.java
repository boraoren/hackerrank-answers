package com.hr.algorithms.warmup.staircase;

import java.util.Scanner;

public class StepInput {

    private int stringerLength;
    private final StepType byStepType;
    private final StringerLengthValidation stringerLengthValidation = new StringerLengthValidation();

    public StepInput(Scanner scanner, StepType stepType){
        this(scanner.nextInt(), stepType);
    }

    public StepInput(int totalStep, StepType stepType){
        setStringerLength(totalStep);
        byStepType = stepType;
    }

    public int getStringerLength() {
        return stringerLength;
    }

    public void setStringerLength(int stringerLength) {
        stringerLengthValidation.validate(stringerLength);
        this.stringerLength = stringerLength;
    }

    public StepType getByStepType() {
        return byStepType;
    }

}
