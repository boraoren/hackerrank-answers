package com.hr.algorithms.warmup.staircase;

public class Step {

    private StepType stepType;
    private String view;

    public Step(String view, StepType stepType){
        setStoneTypeEnum(stepType);
        setView(view);
    }

    public void setStoneTypeEnum(StepType stepType) {
        this.stepType = stepType;
    }

    public void setView(String view) {
        this.view = view;
    }

    public String getView() {
        return view;
    }

    @Override
    public String toString() {
        return "Step{" +
                "stepType=" + stepType +
                ", view='" + view + '\'' +
                '}';
    }
}
