package com.hr.datastructures.arrays.leftrotation;

public class MarathonRunnerValidation {

    public boolean validateShirtNumber(int shirtNumber) throws MarathonRunnerShirtNumberValidationException{
        if (!(shirtNumber >= 1 && shirtNumber < Math.pow(10, 6))) {
            String errorMessage = "Marathon Runner's shirt number must be bigger and equals than 1 and smaller than 10 exponent 6";
            throw new MarathonRunnerShirtNumberValidationException(errorMessage);
        }

        return true;
    }
}
