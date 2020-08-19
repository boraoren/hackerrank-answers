package com.hr.datastructures.arrays.leftrotation;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MarathonTest {



    @Test
    public void setMarathonRunners_marathonRunnersInputWithShirtNumbers_1_2_3_4_5_forTrackLanes_Is_6_byScanner_throwsTrackLanesMaxTotalValidationException(){
        //given
        String marathonRunnersInputWithShirtNumbers = "1 2 3 4 5";
        int forTrackLanes = (int)Math.pow(10,6);

        InputStream inputStream = new ByteArrayInputStream(marathonRunnersInputWithShirtNumbers.getBytes());
        Scanner byScanner = new Scanner(inputStream);

        //when
        Marathon marathon = new Marathon();
        String message = "Total number of track lanes should be equal or smaller than 10 exponent 5";
        TrackLanesMaxTotalValidationException selectedTrackLaneIsNotValid = assertThrows(
                TrackLanesMaxTotalValidationException.class,
                () -> marathon.setMarathonRunners(forTrackLanes, byScanner),
                message
        );

        //then
        assertEquals(message, selectedTrackLaneIsNotValid
                .getMessage());

    }

    @Test
    public void setMarathonRunners_marathonRunnersInputWithShirtNumbers_1_2_3_4_5_forTrackLanes_Is_6_byScanner_throwsTrackLanesMinTotalValidationException(){
        //given
        String marathonRunnersInputWithShirtNumbers = "1 2 3 4 5";
        int forTrackLanes = 0;

        InputStream inputStream = new ByteArrayInputStream(marathonRunnersInputWithShirtNumbers.getBytes());
        Scanner byScanner = new Scanner(inputStream);

        //when
        Marathon marathon = new Marathon();
        String message = "Total number of track lanes should be bigger than 0";
        TrackLanesMinTotalValidationException selectedTrackLaneIsNotValid = assertThrows(
                TrackLanesMinTotalValidationException.class,
                () -> marathon.setMarathonRunners(forTrackLanes, byScanner),
                message
        );

        //then
        assertEquals(message, selectedTrackLaneIsNotValid
                .getMessage());

    }


}
