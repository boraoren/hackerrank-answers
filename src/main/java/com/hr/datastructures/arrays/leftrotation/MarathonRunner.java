package com.hr.datastructures.arrays.leftrotation;

public class MarathonRunner {

    private int shirtNumber;
    private final MarathonRunnerValidation
            marathonRunnerValidation = new MarathonRunnerValidation();

    public MarathonRunner(int withShirtNumber) {
        setShirtNumber(withShirtNumber);
    }

    public void setShirtNumber(int shirtNumber) {
        marathonRunnerValidation.validateShirtNumber(shirtNumber);
        this.shirtNumber = shirtNumber;
    }

    public int getShirtNumber() {
        return shirtNumber;
    }

    @Override
    public String toString() {
        return "MarathonRunner{" +
                "shirtNumber=" + shirtNumber +
                '}';
    }
}
