package com.hr.algorithms.warmup.comparethetriplets;

import com.common.exceptions.ConstraintValidationException;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.samePropertyValuesAs;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ReviewerTest {

    @Test
    public void setProblemRate_forDeveloperAliceWithProblemAndScannerInputsWithDummyRateCategoriesPoints_shouldRateCategoriesPointsBe_1_3_5() {
        //given
        String forAlice = "Alice";
        Developer forDeveloperAlice = createDeveloperWithProblem(forAlice);

        String withDummyRateCategoriesPoints = "1 3 5";
        setScannerInputForDeveloperProblemRateCategoriesPoints(withDummyRateCategoriesPoints);

        //when
        Reviewer reviewer = new Reviewer();
        reviewer.setProblemRate(forDeveloperAlice);
        int[] rateCategoriesPoints = forDeveloperAlice
                .getProblemRate()
                .getCategoriesPoints();

        //then
        int[] expectedRateCategoriesPoints = new int[]{1, 3, 5};
        assertThat(rateCategoriesPoints, is(expectedRateCategoriesPoints));

    }

    @Test
    public void getScores_forDeveloperAliceProblemAndDeveloperBobProblemAndDummyRateCategoriesPoints_shouldScoreValuesBe_1_1() {
        //given
        String forAlice = "Alice";
        Developer forDeveloperAlice = createDeveloperWithProblem(forAlice);
        String forDummyRateCategoriesPoints = "5 6 7";
        setScannerInputForDeveloperProblemRateCategoriesPoints(forDummyRateCategoriesPoints);
        Reviewer reviewer = new Reviewer();
        reviewer.setProblemRate(forDeveloperAlice);

        String forBob = "Bob";
        Developer forDeveloperBob = createDeveloperWithProblem(forBob);
        setScannerInputForDeveloperProblemRateCategoriesPoints("3 6 10");
        reviewer = new Reviewer();
        reviewer.setProblemRate(forDeveloperBob);

        Developer[] ofDevelopers = new Developer[]{
                forDeveloperAlice,
                forDeveloperBob
        };

        //when
        Map<String, Integer> scores = reviewer.getScores(ofDevelopers);

        //then
        Map<String, Integer> expectedScores = new HashMap<String, Integer>() {{
            put("Alice", 1);
            put("Bob", 1);
        }};

        assertThat(scores, is(expectedScores));
    }

    @Test
    public void getScores_forDeveloperAliceProblemAndDeveloperBobProblemAndDummyRateCategoriesPoints_shouldScoreValuesBe_2Alice_1Bob() {
        //given
        String forAlice = "Alice";
        Developer forDeveloperAlice = createDeveloperWithProblem(forAlice);
        String forDummyRateCategoriesPoints = "17 28 30";
        setScannerInputForDeveloperProblemRateCategoriesPoints(forDummyRateCategoriesPoints);
        Reviewer reviewer = new Reviewer();
        reviewer.setProblemRate(forDeveloperAlice);

        String forBob = "Bob";
        Developer forDeveloperBob = createDeveloperWithProblem(forBob);
        setScannerInputForDeveloperProblemRateCategoriesPoints("99 16 8");
        reviewer = new Reviewer();
        reviewer.setProblemRate(forDeveloperBob);

        Developer[] ofDevelopers = new Developer[]{
                forDeveloperAlice,
                forDeveloperBob
        };

        //when
        Map<String, Integer> scoresMap = reviewer.getScores(ofDevelopers);
        String scores = scoresMap.keySet().stream()
                .map(key -> scoresMap.get(key) + "")
                .collect(Collectors.joining(" "));

        //then
        String expectedScores = "2 1";



        assertThat(scores, is(expectedScores));
    }

    @Test
    public void getReviewResultBy_byRateCategoryProblemClarityAndForDevelopersAliceAndBob_shouldBe_TopDeveloperAlice_ProblemRateStatusIsREWIEWED_CategoryPointIs1() {
        //given
        ProblemRateCategory problemRateCategory = ProblemRateCategory.PROBLEM_CLARITY;

        String forAlice = "Alice";
        Developer forDeveloperAlice = createDeveloperWithProblem(forAlice);
        String forDummyRateCategoriesPoints = "5 6 7";
        setScannerInputForDeveloperProblemRateCategoriesPoints(forDummyRateCategoriesPoints);
        Reviewer reviewer = new Reviewer();
        reviewer.setProblemRate(forDeveloperAlice);

        String forBob = "Bob";
        Developer forDeveloperBob = createDeveloperWithProblem(forBob);
        setScannerInputForDeveloperProblemRateCategoriesPoints("3 6 10");
        reviewer = new Reviewer();
        reviewer.setProblemRate(forDeveloperBob);

        Developer[] ofDevelopers = new Developer[]{
                forDeveloperAlice,
                forDeveloperBob
        };

        //when
        ReviewResult reviewResult = reviewer.getReviewResultBy(problemRateCategory, ofDevelopers);


        //then
        ReviewResult expectedReviewResult = new ReviewResult(ofDevelopers);
        expectedReviewResult.setTopDeveloperName("Alice");

        ProblemRateStatus problemRateStatus = ProblemRateStatus.REVIEWED;
        expectedReviewResult.setProblemRateStatus(problemRateStatus);

        expectedReviewResult.setDeveloperCategoryPoint(5);

        assertThat(reviewResult, samePropertyValuesAs(expectedReviewResult));


    }

    @Test
    public void setProblemRate_forDeveloperAliceProblemAndDummyRateCategoriesPoints_throwsConstraintsViolationExceptionForMaximumLimit() {
        //given
        String forAlice = "Alice";
        Developer forDeveloperAlice = createDeveloperWithProblem(forAlice);
        String forAliceCategoriesRatePoints = "5 6 101";
        setScannerInputForDeveloperProblemRateCategoriesPoints(forAliceCategoriesRatePoints);
        Reviewer reviewer = new Reviewer();

        //when
        String message = "Developer rate's category point is not valid, maximum value must be smaller than 101";

        ConstraintValidationException constraintValidationException = assertThrows(
                ConstraintValidationException.class,
                () -> reviewer.setProblemRate(forDeveloperAlice), message
        );

        //then
        assertTrue(constraintValidationException
                .getMessage()
                .contains(message));

    }

    @Test
    public void setProblemRate_forDeveloperAliceProblemAndDummyRateCategoriesPoints_throwsConstraintsViolationExceptionForMinimumLimit() {
        //given
        String forAlice = "Alice";
        Developer forDeveloperAlice = createDeveloperWithProblem(forAlice);
        String forAliceCategoriesRatePoints = "0 6 18";
        setScannerInputForDeveloperProblemRateCategoriesPoints(forAliceCategoriesRatePoints);
        Reviewer reviewer = new Reviewer();

        //when
        String message = "Developer rate's category point is not valid, minimum value must be bigger than 0";

        ConstraintValidationException constraintValidationException = assertThrows(
                ConstraintValidationException.class,
                () -> reviewer.setProblemRate(forDeveloperAlice), message
        );

        //then
        assertTrue(constraintValidationException
                .getMessage()
                .contains(message));

    }


    private Developer createDeveloperWithProblem(String withName) {
        Developer developer = new Developer(withName);
        Problem withProblem = new HackerrankProblem("Problem Title");
        developer.createProblem(withProblem);

        return developer;
    }

    private void setScannerInputForDeveloperProblemRateCategoriesPoints(String developerDummyRateCategoriesPoint) {
        InputStream in = new ByteArrayInputStream(developerDummyRateCategoriesPoint.getBytes());
        System.setIn(in);
    }

}
