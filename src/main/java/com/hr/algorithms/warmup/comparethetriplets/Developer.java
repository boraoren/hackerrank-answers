package com.hr.algorithms.warmup.comparethetriplets;

public class Developer {

    private String name;
    private Problem problem;

    public Developer(String withName){
        setName(withName);
    }

    public void setName(String withName) {
        name = withName;
    }

    public String getName() {
        return name;
    }

    public boolean createProblem(Problem withProblem) {
        problem = withProblem;
        // Some business code ...
        return true;
    }

    public Problem getProblem() {
        return problem;
    }

    public void setProblemRate(ProblemRate problemRate) {
        problem.setRate(problemRate);
    }

    public ProblemRate getProblemRate(){
        return problem.getRate();
    }

    public int getProblemRateCategoriesPoint(int rateCategoryId) {
        return problem.getRate().getCategoryPoint(rateCategoryId);
    }
}
