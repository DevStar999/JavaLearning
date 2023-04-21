package com.company.aftergapinterviewprep.part1;

import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.Deque;
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

        /* Wrapper Classes like 'Integer', 'Character', 'Boolean' etc. */
        // Visit the class 'WrapperClasses.java' in the package 'datatypes' in this project

        // 'Deque' interface (child interface of 'Queue') - Just offers some additional methods
        Deque<Integer> q3 = new ArrayDeque();
        q3.addFirst(53); // addFirst() method is used to add an element at the head
        q3.addLast(89); // addLast() method is same as add() method which is used to add an element at the tail
        int pollFirstElement = q3.pollFirst(); // pollFirst() method will remove element at head, same as poll() method
        int pollLastElement = q3.pollLast(); // pollLast() method will remove element at tail
        // This is just an extra interface which we can use if required
    }
}
