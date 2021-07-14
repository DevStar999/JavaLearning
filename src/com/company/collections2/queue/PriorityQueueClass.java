package com.company.collections2.queue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.SortedSet;
import java.util.TreeSet;

// Example Class for use in Priority Queue. 
class ExampleClass {
    private Integer field1;
    private Integer field2;

    public Integer getField1() {
        return field1;
    }

    public void setField1(Integer field1) {
        this.field1 = field1;
    }

    public Integer getField2() {
        return field2;
    }

    public void setField2(Integer field2) {
        this.field2 = field2;
    }
}

// Comparator Class for ExampleClass.
class ExampleClassComparator implements Comparator<ExampleClass> {
    public int compare(ExampleClass ob1, ExampleClass ob2) {
        if ((ob1.getField1()).compareTo(ob2.getField1()) == 0) {
            return (ob1.getField2()).compareTo(ob2.getField2());
        }
        return (ob1.getField1()).compareTo(ob2.getField1());
    }
}

// Generic Comparator Class for Ascending Ordering of values.
// (Note - This is the default comparator for the PriorityQueue Object.)
class AscendingOrder<T extends Comparable<T>> implements Comparator<T> {
    public int compare(T ob1, T ob2) {
        return ob1.compareTo(ob2);
    }
}

// Generic Comparator Class for Descending Ordering of values.
class DescendingOrder<T extends Comparable<T>> implements Comparator<T> {
    public int compare(T ob1, T ob2) {
        return (-1) * ob1.compareTo(ob2);
    }
}

// Main Class for the file.
public class PriorityQueueClass {
    public static <T> void printPQ(Queue<T> pq) {
        Queue<T> pqCopy = new PriorityQueue<T>(pq);
        while (pqCopy.size() > 0) {
            System.out.print(pqCopy.peek() + " ");
            pqCopy.poll();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue1 = new PriorityQueue<>();
        PriorityQueue<Integer> priorityQueue2 = new PriorityQueue<>();
        List<Integer> list = new ArrayList<>();
        SortedSet<Integer> sortedSet = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            priorityQueue1.add(i * 10);
            priorityQueue2.add(i + 40);
            list.add(i + 200);
            sortedSet.add(i + 4000);
        }
        priorityQueue1.add(-1);
        priorityQueue1.add(22);
        priorityQueue1.add(35);
        priorityQueue1.add(2000);
        priorityQueue2.add(-3);
        priorityQueue2.add(19);
        priorityQueue2.add(41);
        priorityQueue2.add(2020);

        /** Constructors for PriorityQueue Class **/
		/* (1) PriorityQueue() - Creates a PriorityQueue with the default initial capacity (11) that 
			   orders its elements according to their natural ordering. 
		*/
        PriorityQueue<Integer> priorityQueue3 = new PriorityQueue<>();
		
		/* (2) PriorityQueue(Collection c) - Creates a PriorityQueue containing the elements in the 
			   specified collection. 
		*/
        PriorityQueue<Integer> priorityQueue4 = new PriorityQueue<>(list);
		
		/* (3) PriorityQueue(int initialCapacity) - Creates a PriorityQueue with the specified initial 
			   capacity that orders its elements according to their natural ordering. 
		*/
        PriorityQueue<Integer> priorityQueue5 = new PriorityQueue<>(10);
		
		/* (4) PriorityQueue(Comparator comparator) - Creates a PriorityQueue that orders its elements 
		   	   according to the specified comparator. 
		*/
        PriorityQueue<Integer> priorityQueue6 = new PriorityQueue<Integer>(new DescendingOrder());
		/* PriorityQueue<Integer> priorityQueue6 =
				new PriorityQueue<Integer>((new PriorityQueue()).comparator().reversed()) ;
		*/ // Trick to use in-built comparator for descending ordering.
		
		/* (5) PriorityQueue(int initialCapacity, Comparator comparator) - Creates a PriorityQueue with 
			   the specified initial capacity that orders its elements according to the specified comparator. 
		*/
        PriorityQueue<Integer> priorityQueue7 = new PriorityQueue<Integer>(10, new DescendingOrder());
		
		/* (6) PriorityQueue(PriorityQueue pq) - Creates a PriorityQueue containing the elements in the 
			   specified priority queue. 
		*/
        PriorityQueue<Integer> priorityQueue8 = new PriorityQueue<>(priorityQueue2);
	
		/* (7) PriorityQueue(SortedSet sortedSet) - Creates a PriorityQueue containing the elements in the specified
		 	   sorted set. 
		*/
        PriorityQueue<Integer> priorityQueue9 = new PriorityQueue<>(sortedSet);

        /** Commonly used methods of PriorityQueue Class **/
        PriorityQueue<String> pq = new PriorityQueue<>();

        // (1) offer() - Adding elements to the queue (Note : Instead of the method offer(), add() can also be used).
        pq.offer("first");
        pq.offer("second");
        pq.offer("third");
        System.out.printf("%s ", pq);
        System.out.println();

        // (2) peek() - Peeking at the front element of the queue.
        System.out.printf("TOP = %s\n", pq.peek());

        // (3) poll() - Removing an element from the queue.
        pq.poll();
        System.out.printf("%s ", pq);
    }
}
