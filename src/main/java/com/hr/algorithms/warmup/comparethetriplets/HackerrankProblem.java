package com.hr.algorithms.warmup.comparethetriplets;

public class HackerrankProblem extends ProblemRate implements Problem {

    private String title;
    private ProblemRate problemRate = null;

    public HackerrankProblem(String withTitle){
        title = withTitle;
    }

    @Override
    public void setTitle(String withTitle) {
        title = withTitle;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setRate(ProblemRate problemRate) {
        this.problemRate = problemRate;
    }

    @Override
    public ProblemRate getRate() {
        return problemRate;
    }


}
