package com.hr.datastructures.arrays.leftrotation;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RefereeTest {

    @Test
    public void organize_marathonRunnersWithShirtNumbers_1_2_3_4_5_organizedByTrackLane_Is_4_shouldOrganizedAs_4_5_1_2_3(){
        //given
        MarathonRunner[] marathonRunners = {
                new MarathonRunner(1),
                new MarathonRunner(2),
                new MarathonRunner(3),
                new MarathonRunner(4),
                new MarathonRunner(5),
        };

        int byTrackLane = 4;

        //when
        Referee referee = new Referee();
        MarathonRunner[] organizedMarathonRunners = referee.organize(marathonRunners, byTrackLane);

        //then
        MarathonRunner[] expectedOrganizedMarathonRunners = {
                new MarathonRunner(5),
                new MarathonRunner(1),
                new MarathonRunner(2),
                new MarathonRunner(3),
                new MarathonRunner(4),
        };
        assertThat(Arrays.toString(organizedMarathonRunners),
                is(Arrays.toString(expectedOrganizedMarathonRunners)));
    }

    @Test
    public void organize_marathonRunnersWithShirtNumbers_1_2_3_4_5_organizedByTrackLane_Is_6_throwsSelectedTrackLaneIsNotValid(){
        //given
        MarathonRunner[] marathonRunners = {
                new MarathonRunner(1),
                new MarathonRunner(2),
                new MarathonRunner(3),
                new MarathonRunner(4),
                new MarathonRunner(5),
        };

        int byTrackLane = 6;

        //when
        Referee referee = new Referee();
        String message = "Selected track lane to use in rotation should be smaller or equal than total number of marathon runners";

        SelectedTrackLaneIsNotValid selectedTrackLaneIsNotValid = assertThrows(
                SelectedTrackLaneIsNotValid.class,
                () -> referee.organize(marathonRunners, byTrackLane),
                message
        );

        //then
        assertEquals(message, selectedTrackLaneIsNotValid
                .getMessage());


    }

    @Test
    public void organize_marathonRunnersWithShirtNumbers_1_2_3_4_5_organizedByTrackLane_Is_0_throwsTrackLanesMinTotalValidationException(){
        //given
        MarathonRunner[] marathonRunners = {
                new MarathonRunner(1),
                new MarathonRunner(2),
                new MarathonRunner(3),
                new MarathonRunner(4),
                new MarathonRunner(5),
        };

        int byTrackLane = 0;

        //when
        Referee referee = new Referee();
        String message = "Total number of track lanes should be bigger than 0";

        TrackLanesMinTotalValidationException selectedTrackLaneIsNotValid = assertThrows(
                TrackLanesMinTotalValidationException.class,
                () -> referee.organize(marathonRunners, byTrackLane),
                message
        );

        //then
        assertEquals(message, selectedTrackLaneIsNotValid
                .getMessage());


    }


}
