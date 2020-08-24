package com.hr.algorithms.warmup.staircase;

public class Worker {

    public Staircase installStaircase(StepInput stepInput) {

        int forTotalStep = stepInput.getStringerLength();
        StepType byStepType = stepInput.getByStepType();

        Staircase staircase = new Staircase();
        Step[] steps = new Step[forTotalStep];

        for (int stepCount = forTotalStep; stepCount > 0; stepCount--) {
            StringBuilder stringer = new StringBuilder();

            for (int stringerCount = 1; stringerCount <= forTotalStep; stringerCount++) {
                if (stringerCount >= stepCount) {
                    stringer.append(byStepType.getValue());
                } else {
                    stringer.append(" ");
                }
            }

            Step step = new Step(stringer.toString(), byStepType);
            steps[forTotalStep - stepCount] = step;
        }

        staircase.setSteps(steps);
        return staircase;
    }

}
