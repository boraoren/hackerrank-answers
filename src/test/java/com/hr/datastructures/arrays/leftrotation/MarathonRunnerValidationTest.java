package com.hr.datastructures.arrays.leftrotation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MarathonRunnerValidationTest {

    @Test
    public void validateShirtNumber_withShirtNumber_10Exponent5_shouldBeValid(){
        //given
        int withShirtNumber = (int)Math.pow(10,5);

        //when
        MarathonRunnerValidation marathonRunnerValidation = new MarathonRunnerValidation();
        boolean isShirtNumberValid = marathonRunnerValidation.validateShirtNumber(withShirtNumber);

        //then
        assertTrue(isShirtNumberValid);
    }

    @Test
    public void validateShirtNumber_withShirtNumber_10Exponent6_throwsMarathonRunnerShirtNumberValidationException(){
        //given
        int withShirtNumber = (int)Math.pow(10,6);

        //when
        MarathonRunnerValidation marathonRunnerValidation = new MarathonRunnerValidation();

        String message = "Marathon Runner's shirt number must be bigger and equals than 1 and smaller than 10 exponent 6";
        MarathonRunnerShirtNumberValidationException marathonRunnerShirtNumberValidationException = assertThrows(
                MarathonRunnerShirtNumberValidationException.class,
                () -> marathonRunnerValidation.validateShirtNumber(withShirtNumber),
                message
        );

        //then
        assertEquals(message, marathonRunnerShirtNumberValidationException
                .getMessage());

    }

}
