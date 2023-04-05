package com.company.aftergapinterviewprep;

import java.io.FileNotFoundException;
import java.util.Random;

public class RecentLearnings2 {

    public static void main(String[] args) throws FileNotFoundException {
        //System.setIn(new FileInputStream("/Users/development/Devwork/Java/IdeaProjects/JavaLearning/src/com/" +
        //        "company/aftergapinterviewprep/input.txt"));

        // Use of 'Random' class object
        Random random = new Random();
        int randomInt = random.nextInt(5); // This will give a number from 0 to 4
        int minValue = 5, maxValue = 10;
        // For the following, Range -> [minValue, maxValue) i.e. minValue is inclusive and maxValue is exclusive
        int randomIntInRange = random.nextInt(maxValue - minValue) + minValue;
    }
}
