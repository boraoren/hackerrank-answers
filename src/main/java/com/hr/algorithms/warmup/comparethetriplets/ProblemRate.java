package com.hr.algorithms.warmup.comparethetriplets;

public class ProblemRate {

    private final int[] categoriesPoints = new int[ProblemRateCategory.values().length];

    public int[] getCategoriesPoints() {
        return categoriesPoints;
    }

    public int getCategoryPoint(int categoryIndex){
        return categoriesPoints[categoryIndex];
    }

    public void addCategoryPoint(ProblemRateCategory forCategory, int withPoint) {
        categoriesPoints[forCategory.ordinal()] = withPoint;
    }
}
