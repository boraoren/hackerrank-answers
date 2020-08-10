package com.hr.algorithms.warmup.comparethetriplets;

public class ReviewResult extends Score {

    private String topDeveloperName;
    private int developerCategoryPoint;
    private ProblemRateStatus problemRateStatus = ProblemRateStatus.REVIEWING;

    public ReviewResult(Developer[] ofDevelopers) {
        super(ofDevelopers);
    }

    public String getTopDeveloperName() {
        return topDeveloperName;
    }

    public void setTopDeveloperName(String topDeveloperName) {
        this.topDeveloperName = topDeveloperName;
    }

    public ProblemRateStatus getProblemRateStatus() {
        return problemRateStatus;
    }

    public void setProblemRateStatus(ProblemRateStatus problemRateStatus) {
        this.problemRateStatus = problemRateStatus;
    }

    public int getDeveloperCategoryPoint() {
        return developerCategoryPoint;
    }

    public void setDeveloperCategoryPoint(int developerCategoryPoint) {
        this.developerCategoryPoint = developerCategoryPoint;
    }
}
