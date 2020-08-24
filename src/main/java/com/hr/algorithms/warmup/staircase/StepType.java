package com.hr.algorithms.warmup.staircase;

public enum StepType {

    STONE('#'),
    WOOD('@'),
    CARPET('*');

    char value;

    StepType(char byValue){
        value = byValue;
    }

    public char getValue() {
        return value;
    }
}
