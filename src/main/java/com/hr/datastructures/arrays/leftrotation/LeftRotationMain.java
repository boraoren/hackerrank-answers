package com.hr.datastructures.arrays.leftrotation;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LeftRotationMain {

    /**
     * Example scenario;
     * ---
     * We are watching Marathon,
     * 1. There are 5 [track lanes] using by runners for marathon
     * 2. Referee finds problem for arrangement of marathon runners
     * and he try to organize marathon runners [by selected track lane]
     */

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int forTrackLanes = scanner.nextInt();
        int bySelectedTrackLane = scanner.nextInt();

        //1.
        Marathon marathon = new Marathon();
        marathon.setMarathonRunners(forTrackLanes, scanner);

        //2.
        Referee referee = new Referee();
        MarathonRunner[] marathonRunners = referee.organize(marathon.getMarathonRunners(), bySelectedTrackLane);

        String orderedMarathonRunners = Arrays
                .stream(marathonRunners)
                .map(marathonRunner -> String.valueOf(marathonRunner.getShirtNumber()))
                .collect(Collectors.joining(" "));

        System.out.println(orderedMarathonRunners);

    }

}
