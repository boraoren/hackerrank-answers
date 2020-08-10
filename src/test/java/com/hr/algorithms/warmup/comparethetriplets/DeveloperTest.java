package com.hr.algorithms.warmup.comparethetriplets;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class DeveloperTest {

    @Test
    public void setName_withName_shouldBeAlice() {
        //given
        String withName = "Alice";
        Developer developer = new Developer(withName);

        //when
        String developerName = developer.getName();

        //then
        String expectedDeveloperName = "Alice";
        assertThat(developerName, is(expectedDeveloperName));
    }

    @Test
    public void createProblem_withDeveloperAliceAndHackerrankProblem_shouldBeProblemCreatedIsTrue(){
        //given
        Problem withHackerrankProblem = new HackerrankProblem("Problem Title");
        String name = "Alice";
        Developer withDeveloperAlice = new Developer(name);

        //when
        boolean problemCreated = withDeveloperAlice.createProblem(withHackerrankProblem);

        //then
        assertThat(problemCreated, is(true));
    }

    @Test
    public void getProblem_withDeveloperAliceAndHackerrankProblemTitle_shouldBeProblemTitleIsDummyTitle1(){
        //given
        String name = "Alice";
        Developer withDeveloperAlice = new Developer(name);

        Problem withHackerrankProblem = new HackerrankProblem("Problem");
        withHackerrankProblem.setTitle("Dummy Title 1");
        withDeveloperAlice.createProblem(withHackerrankProblem);

        //when
        Problem hackerrankProblem = withDeveloperAlice.getProblem();
        String hackerrankProblemTitle = hackerrankProblem.getTitle();

        //then
        String expectedHackerrankProblemTitle = "Dummy Title 1";
        assertThat(hackerrankProblemTitle, is(expectedHackerrankProblemTitle));
    }

    @Test
    public void setProblemRate_withDeveloperAliceAndHackerrankProblemAndProblemRateCategoriesPointsAre_1_2_3_shouldBe_1_2_3(){
        //given
        String withName = "Alice";
        Developer withDeveloperAlice = new Developer(withName);
        Problem withHackerrankProblem = new HackerrankProblem("Problem TItle");

        ProblemRate withProblemRate = new ProblemRate();
        withProblemRate.addCategoryPoint(ProblemRateCategory.PROBLEM_CLARITY, 1);
        withProblemRate.addCategoryPoint(ProblemRateCategory.ORIGINALITY, 2);
        withProblemRate.addCategoryPoint(ProblemRateCategory.DIFFICULTY, 3);

        //when
        withDeveloperAlice.createProblem(withHackerrankProblem);
        withDeveloperAlice.setProblemRate(withProblemRate);

        //then
        ProblemRate developerAliceProblemRate = withDeveloperAlice.getProblemRate();
        int[] categoriesPoints = developerAliceProblemRate.getCategoriesPoints();
        int[] expectedCategoriesPoints = new int[]{1, 2, 3};

        assertThat(categoriesPoints, is(expectedCategoriesPoints));
    }

}
