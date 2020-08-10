package com.hr.algorithms.warmup.comparethetriplets;

import java.util.LinkedHashMap;
import java.util.Map;

public class Score {

    private final Map<String, Integer>
            ofDevelopers = new LinkedHashMap<>();

    public Map<String, Integer> getScores(){
        return ofDevelopers;
    }

    public Score(Developer[] ofDevelopers){
        registerForScoring(ofDevelopers);
    }

    private void registerForScoring(Developer[] ofDevelopers){
        for(Developer developer: ofDevelopers){
            this.ofDevelopers.put(developer.getName(), 0);
        }
    }

    public int getScore(String developerName) {
        return ofDevelopers.get(developerName);
    }

    public void addScore(String ofDeveloperName) {
        ofDevelopers.merge(ofDeveloperName, 1,
                Integer::sum);
    }
}
