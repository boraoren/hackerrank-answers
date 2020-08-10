package com.hr.algorithms.warmup.comparethetriplets;

import java.util.Map;
import java.util.Scanner;

public class CompareTheTripletsMain {

    /**
     * - We have 2 developers in contest.
     * Their names are Alice and Bob.
     * Alice and Bob create their problem
     * for hackerrank.
     *
     * <p>
     * - We have reviewer for this competition.
     * Reviewer will review contestants and
     * print scores for them.
     *
     */

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Developer developerAlice = new Developer("Alice");
        Problem developerAliceProblem = new HackerrankProblem("Alice's problem for hackerrank");
        developerAlice.createProblem(developerAliceProblem);

        Developer developerBob = new Developer("Bob");
        Problem developerBobProblem = new HackerrankProblem("Bob's problem for hackerrank");
        developerBob.createProblem(developerBobProblem);

        Developer[] developers = new Developer[]{
                developerAlice,
                developerBob
        };

        Reviewer reviewer = new Reviewer();
        Map<String, Integer> scores = reviewer.getScores(developers,scanner);
        reviewer.printScores(scores);

    }

}
