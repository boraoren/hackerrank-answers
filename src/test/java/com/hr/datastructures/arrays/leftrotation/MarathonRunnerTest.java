package com.hr.datastructures.arrays.leftrotation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MarathonRunnerTest {

    @Test
    public void initializeMarathonRunner_withShirtNumber_10Exponent6_throwsMarathonRunnerShirtNumberValidationException(){
        //given
        int withShirtNumber = (int)Math.pow(10,6);

        //when
        MarathonRunnerValidation marathonRunnerValidation = new MarathonRunnerValidation();

        String message = "Marathon Runner's shirt number must be bigger and equals than 1 and smaller than 10 exponent 6";
        MarathonRunnerShirtNumberValidationException marathonRunnerShirtNumberValidationException = assertThrows(
                MarathonRunnerShirtNumberValidationException.class,
                () -> new MarathonRunner(withShirtNumber),
                message
        );

        //then
        assertEquals(message, marathonRunnerShirtNumberValidationException
                .getMessage());

    }

}
