package com.hr.algorithms.warmup.comparethetriplets;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ScoreTest {

    @Test
    public void addScore_withDeveloperNameAliceAndAddProblemRateScores_2_shouldBe_2(){
        //given
        String withDeveloperNameAlice = "Alice";

        //when
        Score score = new Score(new Developer[]{});
        score.addScore(withDeveloperNameAlice);
        score.addScore(withDeveloperNameAlice);

        //then
        int expectedPoints = 2;
        int developerAliceScorePoint = score.getScore(withDeveloperNameAlice);

        assertThat(developerAliceScorePoint, is(expectedPoints));
    }

}
