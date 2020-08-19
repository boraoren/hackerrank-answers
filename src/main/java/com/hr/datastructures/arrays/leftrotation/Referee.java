package com.hr.datastructures.arrays.leftrotation;

public class Referee {

    private final TrackLanesValidation trackLanesValidation = new TrackLanesValidation();

    public Referee(){}


    public MarathonRunner[] organize(MarathonRunner[] marathonRunners,
                                     int byTrackLane) {

        int totalNumberOfMarathonRunners = marathonRunners.length;

        trackLanesValidation.validateSelected(byTrackLane, totalNumberOfMarathonRunners);

        int mod = byTrackLane % totalNumberOfMarathonRunners;

        MarathonRunner[] organizedMarathonRunners = new MarathonRunner[totalNumberOfMarathonRunners];

        for (int trackLaneNumber = 0; trackLaneNumber < totalNumberOfMarathonRunners; ++trackLaneNumber) {
            organizedMarathonRunners[trackLaneNumber] =
                    marathonRunners[(trackLaneNumber + mod) % totalNumberOfMarathonRunners];
        }

        return organizedMarathonRunners;
    }


}
