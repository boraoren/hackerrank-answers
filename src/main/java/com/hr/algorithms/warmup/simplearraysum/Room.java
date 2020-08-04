package com.hr.algorithms.warmup.simplearraysum;

public class Room {

    private Dumbbell[] dumbbells;

    public void setDumbbells(int sizeOfDumbbells, int[] withWeights) {
        DumbbellValidation.validateDumbbells(sizeOfDumbbells, withWeights);
        DumbbellValidation.validateSizeOfDumbbells(sizeOfDumbbells);

        dumbbells = new Dumbbell[sizeOfDumbbells];
        for(int index=0;index< dumbbells.length;index++){
            dumbbells[index] = new Dumbbell(withWeights[index]);
        }

    }

    public Dumbbell[] getDumbbells(){
        return dumbbells;
    }

}
