package com.hr.algorithms.warmup.simplearraysum;

public class Dumbbell {

    private int weight;

    public Dumbbell(){}

    public Dumbbell(int weight){
        setWeight(weight);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        DumbbellValidation.validateWeight(weight);
        this.weight = weight;
    }
}
