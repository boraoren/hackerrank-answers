package com.hr.algorithms.warmup.staircase;

public class Staircase {

    private Step[] steps;

    public void setSteps(Step[] bySteps){
        steps = bySteps;
    }

    public Step[] getSteps() {
        return steps;
    }

    public void show() {
        for (Step step : getSteps()) {
            System.out.println(step.getView());
        }
    }
}
