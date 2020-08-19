package com.hr.datastructures.arrays.leftrotation;

public class TrackLanesValidation {

    public void validateSelected(int byTrackLane, int totalNumberOfMarathonRunners) throws SelectedTrackLaneIsNotValid {

        validateTotal(byTrackLane);

        if(!(byTrackLane<=totalNumberOfMarathonRunners)){
            String errorMessage = "Selected track lane to use in rotation should be smaller or equal than total number of marathon runners";
            throw new SelectedTrackLaneIsNotValid(errorMessage);
        }
    }

    public boolean validateTotal(int forTrackLanes) {
        validateTotalMin(forTrackLanes);
        validateTotalMax(forTrackLanes);
        return true;
    }

    public void validateTotalMin(int trackLanes) throws TrackLanesMinTotalValidationException {
        if(trackLanes <= 0){
            String errorMessage = "Total number of track lanes should be bigger than 0";
            throw new TrackLanesMinTotalValidationException(errorMessage);
        }
    }

    public void validateTotalMax(double trackLanes) throws TrackLanesMaxTotalValidationException {
        if(trackLanes > Math.pow(10, 5)){
            String errorMessage = "Total number of track lanes should be equal or smaller than 10 exponent 5";
            throw new TrackLanesMaxTotalValidationException(errorMessage);
        }
    }


}
