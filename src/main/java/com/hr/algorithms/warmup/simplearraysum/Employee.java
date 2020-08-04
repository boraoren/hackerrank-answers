package com.hr.algorithms.warmup.simplearraysum;

public class Employee {
    public int sumOfDumbbellWeights(FitnessCenter inFitnessCenter) {
        Room room = inFitnessCenter.getRoom();
        Dumbbell[] dumbbells = room.getDumbbells();
        int sumOfDumbbells = 0;
        for(Dumbbell dumbbell : dumbbells){
            sumOfDumbbells +=dumbbell.getWeight();
        }
        return sumOfDumbbells;
    }
}
