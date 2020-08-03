package com.hr.datastructures.arrays.twodarrayds;

import com.common.exceptions.ConstraintValidationException;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LogisticTest {

    private final Logistic logistic = new Logistic();

    @Test
    public void order_withContainerContentPathAndContainerWidthAndContainerHeight_shouldBeExpectedContainerContent() {
        //given
        String withContainerContentFilePath = "src/test/resources/testcontainercontent.data";

        //when
        int[][] containerContent = logistic.order(withContainerContentFilePath);

        //then
        int[][] expectedContainerContent = new int[][]{
                {1, 1, 1, 0, 0, 0,},
                {0, 1, 0, 0, 0, 0,},
                {1, 1, 1, 0, 0, 0,},
                {0, 0, 2, 4, 4, 0,},
                {0, 0, 0, 2, 0, 0,},
                {0, 0, 1, 2, 4, 0,},
        };

        assertThat(containerContent, is(expectedContainerContent));

    }

    @Test
    public void order_withScannerAndHeightAndWidth_shouldBeExpectedContainerContent() throws FileNotFoundException {
        //given
        Scanner withScanner = new Scanner(new File("src/test/resources/testcontainercontent.data"));
        int withHeight = 6;
        int withWidth = 6;

        //when
        int[][] containerContent = logistic.order(withScanner, withHeight, withWidth);

        //then
        int[][] expectedContainerContent = new int[][]{
                {1, 1, 1, 0, 0, 0,},
                {0, 1, 0, 0, 0, 0,},
                {1, 1, 1, 0, 0, 0,},
                {0, 0, 2, 4, 4, 0,},
                {0, 0, 0, 2, 0, 0,},
                {0, 0, 1, 2, 4, 0,},
        };

        assertThat(containerContent, is(expectedContainerContent));
    }

    @Test
    public void order_withScannerInputIsBiggerThan9AndHeightAndWidth_throwsConstraintValidationException() throws FileNotFoundException {

        //given
        Scanner withScanner = new Scanner(new File("src/test/resources/testcontainercontent-scannerInputIsBiggerThan9.data"));
        int withHeight = 6;
        int withWidth = 6;

        //when
        String message = "input 10 must be bigger than -9 and smaller than 9";

        ConstraintValidationException constraintValidationException = assertThrows(
                ConstraintValidationException.class,
                () -> logistic.order(withScanner, withHeight, withWidth),
                message
        );

        //then
        assertTrue(constraintValidationException
                .getMessage()
                .contains(message));

    }

    @Test
    public void order_withScannerInputIsSmallerThanMinus9AndHeightAndWidth_throwsConstraintValidationException() throws FileNotFoundException {

        //given
        Scanner withScanner = new Scanner(new File("src/test/resources/testcontainercontent-scannerInputIsSmallerThanMinus9.data"));
        int withHeight = 6;
        int withWidth = 6;

        //when
        String message = "input -10 must be bigger than -9 and smaller than 9";

        ConstraintValidationException constraintValidationException = assertThrows(
                ConstraintValidationException.class,
                () -> logistic.order(withScanner, withHeight, withWidth),
                message
        );

        //then
        assertTrue(constraintValidationException
                .getMessage()
                .contains(message));

    }


    @Test
    public void order_withContainerContentPathDataIsSmallerThanMinus9AndHeightAndWidth_throwsConstraintValidationException() throws FileNotFoundException {

        //given
        String withContainerContentFilePath = "src/test/resources/testcontainercontent-scannerInputIsSmallerThanMinus9.data";

        //when
        String message = "input -10 must be bigger than -9 and smaller than 9";

        ConstraintValidationException constraintValidationException = assertThrows(
                ConstraintValidationException.class,
                () -> logistic.order(withContainerContentFilePath),
                message
        );

        //then
        assertTrue(constraintValidationException
                .getMessage()
                .contains(message));

    }


    @Test
    public void order_withContainerContentPathDataIsBiggerThan9AndHeightAndWidth_throwsConstraintValidationException() throws FileNotFoundException {

        //given
        String withContainerContentFilePath = "src/test/resources/testcontainercontent-scannerInputIsBiggerThan9.data";

        //when
        String message = "input 10 must be bigger than -9 and smaller than 9";

        ConstraintValidationException constraintValidationException = assertThrows(
                ConstraintValidationException.class,
                () -> logistic.order(withContainerContentFilePath),
                message
        );

        //then
        assertTrue(constraintValidationException
                .getMessage()
                .contains(message));

    }

}
