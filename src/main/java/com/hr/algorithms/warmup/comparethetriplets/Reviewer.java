package com.hr.algorithms.warmup.comparethetriplets;

import java.util.Map;
import java.util.Scanner;

public class Reviewer {

    private Scanner scanner = new Scanner(System.in);

    public void setProblemRate(Developer forDeveloper) {

        Problem problem = forDeveloper.getProblem();
        //do some business with problem to rate it
        //we use it with scanner's input dummy values
        //...
        //...

        ProblemRate problemRate = new ProblemRate();
        int rateCategoriesLength = ProblemRateCategory.values().length;
        for (int rateCategory = 0; rateCategory < rateCategoriesLength; rateCategory++) {
            int categoryPoint = scanner.nextInt();
            ReviewCategoryPointValidation.isValid(categoryPoint);
            problemRate.addCategoryPoint(ProblemRateCategory.values()[rateCategory], categoryPoint);
        }

        forDeveloper.setProblemRate(problemRate);

    }

    // for hackerrank site problem submissions
    public Map<String, Integer> getScores(Developer[] ofDevelopers, Scanner byScanner) {

        this.scanner = byScanner;

        for(Developer developer: ofDevelopers){
            setProblemRate(developer);
        }

        return getScores(ofDevelopers);
    }

    public Map<String, Integer> getScores(Developer[] ofDevelopers) {

        Score score = new Score(ofDevelopers);

        for (ProblemRateCategory problemRateCategory : ProblemRateCategory.values()) {

            ReviewResult reviewResult = getReviewResultBy(problemRateCategory, ofDevelopers);

            if(!(reviewResult.getProblemRateStatus() == ProblemRateStatus.TIE)) {
                score.addScore(reviewResult.getTopDeveloperName());
            }
        }

        return score.getScores();
    }

    public ReviewResult getReviewResultBy(ProblemRateCategory problemRateCategory, Developer[] ofDevelopers){

        ReviewResult reviewResult = new ReviewResult(ofDevelopers);

        for (Developer developer : ofDevelopers) {

            int categoryPoint = developer.getProblemRateCategoriesPoint(problemRateCategory.ordinal());

            if (reviewResult.getDeveloperCategoryPoint() < categoryPoint) {
                //If a[i] > b[i], then a is awarded 1 point
                reviewResult.setTopDeveloperName(developer.getName());
                reviewResult.setDeveloperCategoryPoint(categoryPoint);
                reviewResult.setProblemRateStatus(ProblemRateStatus.REVIEWED);

            } else if (reviewResult.getDeveloperCategoryPoint() == categoryPoint) {
                //If a[i] = b[i], then neither person receives a point.
                reviewResult.setProblemRateStatus(ProblemRateStatus.TIE);
            }
        }

        return reviewResult;

    }

    public void printScores(Map<String, Integer> scores){
        scores.forEach((developerName, score) -> System.out.printf("%d ",score));
    }


}
