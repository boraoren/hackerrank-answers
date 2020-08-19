package com.hr.datastructures.arrays.leftrotation;

import com.common.exceptions.ConstraintValidationException;

public class SelectedTrackLaneIsNotValid extends ConstraintValidationException {
    public SelectedTrackLaneIsNotValid(String errorMessage) {
        super(errorMessage);
    }
}
