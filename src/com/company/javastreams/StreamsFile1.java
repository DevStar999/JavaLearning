package com.company.javastreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFile1 {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 6, 2, 7, 3, 8, 5, 4);

        // The Operations on Streams are as follows.

        /** Intermediate Operations **/
		/* (1) map : The map method is used to map the items in the collection to other objects 
		 			 according to the Predicate passed as argument. 
		*/
        List<Integer> squares = nums.stream().map(x -> x * x).collect(Collectors.toList());

        /* (2) filter : The filter method is used to select elements as per the Predicate passed as argument. */
        List<Integer> even = nums.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());

        /* (3) sorted : The sorted method is used to sort the stream. */
        List<Integer> sorted = nums.stream().sorted().collect(Collectors.toList());
		
		/* (4) limit : The limit method is used to reduce the size of the stream. The following code 
		 			   segment shows how to print 10 random numbers using limit. 
		*/
        System.out.println("The first 6 elements of the 'nums' List in sorted order are as follows :");
        nums.stream().limit(6).sorted().forEach(x -> System.out.print(x + " "));

        /** Terminal Operations **/
		/* (1) collect : The collect method is used to return the result of the intermediate operations 
						 performed on the stream. 
		*/
        List<Integer> col1 = nums.stream().sorted().collect(Collectors.toList());

        /* (2) forEach : The forEach method is used to iterate through every element of the stream. */
        System.out.println("\nThe odd numbers of the 'nums' List are as follows :");
        nums.stream().filter(x -> x % 2 == 1).forEach(x -> System.out.print(x + " "));
		
		/* (3) reduce : The reduce method is used to reduce the elements of a stream to a single value. The reduce 
						method takes a BinaryOperator as a parameter. (Optional : Along with a start value. )  
		*/
        System.out.print("\nThe sum of all the even numbers in the 'nums' List = ");
        System.out.println(nums.stream().filter(x -> x % 2 == 0).reduce(0, (start, lead) -> start + lead));
    }

}
