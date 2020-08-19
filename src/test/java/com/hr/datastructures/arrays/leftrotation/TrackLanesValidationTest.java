package com.hr.datastructures.arrays.leftrotation;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

public class TrackLanesValidationTest {

    private final TrackLanesValidation trackLanesValidation = new TrackLanesValidation();

    @Test
    public void validateTotalMin_trackLanes_is_0_throwsTrackLanesMinTotalValidationException() {
        //given
        int trackLanes = 0;

        //when
        String message = "Total number of track lanes should be bigger than 0";

        TrackLanesMinTotalValidationException trackLanesMinTotalValidationException = assertThrows(
                TrackLanesMinTotalValidationException.class,
                () -> trackLanesValidation.validateTotalMin(trackLanes),
                message
        );

        //then
        assertEquals(message, trackLanesMinTotalValidationException
                .getMessage());

    }


    @Test
    public void validateTotalMax_numberOfTrackLanes_is_10Exponent6_throwsTrackLanesMaxTotalValidationException() {
        //given
        double totalNumberOfTrackLanes = Math.pow(10, 6);

        //when
        String message = "Total number of track lanes should be equal or smaller than 10 exponent 5";

        TrackLanesMaxTotalValidationException trackLanesMaxTotalValidationException = assertThrows(
                TrackLanesMaxTotalValidationException.class,
                () -> trackLanesValidation.validateTotalMax(totalNumberOfTrackLanes),
                message
        );

        //then
        assertEquals(message, trackLanesMaxTotalValidationException
                .getMessage());

    }


    @Test
    public void validateTotal_numberOfTrackLanes_is_5_shouldBeValid() {
        //given
        int totalNumberOfTrackLanes = 5;

        //when
        boolean isTotalNumberOfTrackLanesValid = trackLanesValidation
                .validateTotal(totalNumberOfTrackLanes);

        //then
        assertThat(isTotalNumberOfTrackLanesValid, is(true));
    }


    @Test
    public void validateSelected_byTrackLaneIs4ForTotalNumberOfMarathonRunnersIs3_throwsSelectedTrackLaneIsNotValid() {
        //given
        int byTrackLane = 4;
        int forTotalNumberOfMarathonRunners = 3;

        //when
        String message = "Selected track lane to use in rotation should be smaller or equal than total number of marathon runners";

        SelectedTrackLaneIsNotValid selectedTrackLaneIsNotValid = assertThrows(
                SelectedTrackLaneIsNotValid.class,
                () -> trackLanesValidation.validateSelected(byTrackLane, forTotalNumberOfMarathonRunners),
                message
        );

        //then
        assertEquals(message, selectedTrackLaneIsNotValid
                .getMessage());

    }


}
