package com.hr.datastructures.arrays.leftrotation;


import java.util.Scanner;

public class Marathon {

    private MarathonRunner[] marathonRunners;
    private final TrackLanesValidation trackLanesValidation = new TrackLanesValidation();

    public void setMarathonRunners(int forTrackLanes, Scanner byScanner) {

        trackLanesValidation.validateTotal(forTrackLanes);

        marathonRunners = new MarathonRunner[forTrackLanes];

        for(int trackLane=0;trackLane<forTrackLanes;trackLane++){
            int withShirtNumber = byScanner.nextInt();
            MarathonRunner marathonRunner = new MarathonRunner(withShirtNumber);
            marathonRunners[trackLane] = marathonRunner;
        }
    }

    public MarathonRunner[] getMarathonRunners() {
        return marathonRunners;
    }

}
