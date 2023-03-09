package com.company.roughwork2048champs;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class RoughWork11 {
    public static void main(String[] args) {
        List<Pair<String, String>> gpgsIds = new ArrayList<>() {{
            /* Sr. No. -> 01 */ add(new Pair<>("ssjrajeshjoshi88@gmail.com", "SsjRajeshJoshi88"));
            /* Sr. No. -> 02 */ add(new Pair<>("hokagemeetpatel1997@gmail.com", "HokageMeetPatel1997"));
            /* Sr. No. -> 03 */ add(new Pair<>("dimpyk1401@gmail.com", "DimpyK1401"));
            /* Sr. No. -> 04 */ add(new Pair<>("kajolk2505@gmail.com", "KajolK2505"));
            /* Sr. No. -> 05 */ add(new Pair<>("sassysheetal2102@gmail.com", "SassySheetal2102"));
            /* Sr. No. -> 06 */ add(new Pair<>("vinay1998x@gmail.com", "WolverineWX99"));
            /* Sr. No. -> 07 */ add(new Pair<>("nerdcoredevelopment@gmail.com", "PlayGamesGamer123"));
            /* Sr. No. -> 08 */ add(new Pair<>("wolverinerage99@gmail.com", "WolverineRage99"));
            /* Sr. No. -> 09 */ add(new Pair<>("vinayrn2904@gmail.com", "GokuMUI2904"));
            /* Sr. No. -> 10 */ add(new Pair<>("codegeek1998@gmail.com", "WolverineOG123"));
            /* Sr. No. -> 11 */ add(new Pair<>("lyricsdestination99@gmail.com", "LyricsDestination99"));
        }};

        List<Integer> gpgsIdPositions = new ArrayList<>();
        for (int value = 1; value <= 11; value++) {
            gpgsIdPositions.add(value);
        }
        Collections.shuffle(gpgsIdPositions);

        /*
        // Old way for printing output
        System.out.println("The shuffled array is as follows - ");
        for (int index = 0; index < gpgsIdPositions.size(); index++) {
            System.out.println("Sr. No. -> " + String.format("%02d", gpgsIdPositions.get(index)) + " -> " +
                    gpgsIds.get(gpgsIdPositions.get(index)-1).getKey() + " -> " +
                    gpgsIds.get(gpgsIdPositions.get(index)-1).getValue() + " -> ");
        }
        */

        /*
        // New way for printing output
        System.out.println("The shuffled array is as follows (New Way) - ");
        for (int index = 0; index < gpgsIdPositions.size(); index++) {
            System.out.println(String.format("%02d", (index + 1)) + ") Sr. No. ->  -> " +
                    gpgsIds.get(gpgsIdPositions.get(index)-1).getKey() + " -> " +
                    gpgsIds.get(gpgsIdPositions.get(index)-1).getValue());
        }
        */

        // System.out.println("Random Number between 25 and 70 = " + getRandomNumberUsingNextInt(25, 70));

        System.out.println("The random game mode scores are as follows - ");
        for (int index = 1; index <= 11; index++) {
            if (index == 1) {
                System.out.println("Rank " + String.format("%02d", index) + " -> " +
                        getRandomNumberUsingNextInt(26400, 31300));
            } else if (index == 2) {
                System.out.println("Rank " + String.format("%02d", index) + " -> " +
                        getRandomNumberUsingNextInt(20700, 23800));
            } else if (index == 3) {
                System.out.println("Rank " + String.format("%02d", index) + " -> " +
                        getRandomNumberUsingNextInt(13500, 15200));
            } else if (index == 4) {
                System.out.println("Rank " + String.format("%02d", index) + " -> " +
                        getRandomNumberUsingNextInt(10500, 11800));
            } else if (index == 5) {
                System.out.println("Rank " + String.format("%02d", index) + " -> " +
                        getRandomNumberUsingNextInt(8500, 9300));
            } else if (index == 6) {
                System.out.println("Rank " + String.format("%02d", index) + " -> " +
                        getRandomNumberUsingNextInt(5700, 7100));
            } else if (index == 7) {
                System.out.println("Rank " + String.format("%02d", index) + " -> " +
                        getRandomNumberUsingNextInt(4100, 4900));
            } else if (index == 8) {
                System.out.println("Rank " + String.format("%02d", index) + " -> " +
                        getRandomNumberUsingNextInt(2700, 3500));
            } else if (index == 9) {
                System.out.println("Rank " + String.format("%02d", index) + " -> " +
                        getRandomNumberUsingNextInt(1700, 2200));
            } else if (index == 10) {
                System.out.println("Rank " + String.format("%02d", index) + " -> " +
                        getRandomNumberUsingNextInt(1100, 1400));
            } else { // index == 11
                System.out.println("Rank " + String.format("%02d", index) + " -> " +
                        getRandomNumberUsingNextInt(700, 950));
            }
        }

        /*
        System.out.println("The random miscellaneous scores are as follows - ");
        for (int index = 1; index <= 11; index++) {
            if (index == 1) {
                System.out.println("Rank " + String.format("%02d", index) + " -> " +
                        (10 * getRandomNumberUsingNextInt(26, 28)));
            } else if (index == 2) {
                System.out.println("Rank " + String.format("%02d", index) + " -> " +
                        (10 * getRandomNumberUsingNextInt(22, 25)));
            } else if (index == 3) {
                System.out.println("Rank " + String.format("%02d", index) + " -> " +
                        (10 * getRandomNumberUsingNextInt(19, 21)));
            } else if (index == 4) {
                System.out.println("Rank " + String.format("%02d", index) + " -> " +
                        (10 * getRandomNumberUsingNextInt(17, 18)));
            } else if (index == 5) {
                System.out.println("Rank " + String.format("%02d", index) + " -> " +
                        (10 * getRandomNumberUsingNextInt(15, 16)));
            } else if (index == 6) {
                System.out.println("Rank " + String.format("%02d", index) + " -> " +
                        (10 * getRandomNumberUsingNextInt(13, 14)));
            } else if (index == 7) {
                System.out.println("Rank " + String.format("%02d", index) + " -> " +
                        (10 * getRandomNumberUsingNextInt(11, 12)));
            } else if (index == 8) {
                System.out.println("Rank " + String.format("%02d", index) + " -> " +
                        (10 * getRandomNumberUsingNextInt(9, 10)));
            } else if (index == 9) {
                System.out.println("Rank " + String.format("%02d", index) + " -> " +
                        (10 * getRandomNumberUsingNextInt(7, 8)));
            } else if (index == 10) {
                System.out.println("Rank " + String.format("%02d", index) + " -> " +
                        (10 * getRandomNumberUsingNextInt(4, 6)));
            } else { // index == 11
                System.out.println("Rank " + String.format("%02d", index) + " -> " +
                        (10 * getRandomNumberUsingNextInt(1, 3)));
            }
        }
        */

        /*
        for (int index = 0; index < gpgsIds.size(); index++) {
            System.out.println("[" + (index+1) + "] User -> " + gpgsIds.get(index).getKey() + " : " +
                    gpgsIds.get(index).getValue());
        }
        List<Long> scores = new ArrayList<>(Arrays.asList());
        */
        /*
        System.out.println("The list of scores for a user is as follows - ");
        for (int index = 1; index <= 10; index++) {
            if (index < 10) {
                System.out.print(getRandomNumberUsingNextInt(465000, 580000) + "L, ");
            } else {
                System.out.print(getRandomNumberUsingNextInt(465000, 580000) + "L");
            }
        }
        */
    }

    private static int getRandomNumberUsingNextInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
}
