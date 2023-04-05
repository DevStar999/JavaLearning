package com.company.rough;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Rough23 {
	public static int customCeil(int number, int divisor) {
		if (number <= divisor) {
			return 1;
		}

		if (number % divisor != 0) {
			return (number/divisor) + 1;
		}

		return number/divisor;
	}

	public int search(int[] nums, int target) {
		int n = nums.length;
		int result = -1;
		int start = 0, end = n-1;

		while (start <= end) {
			if (start == end) {
				if (nums[start] == target) {
					result = start;
				}
				break;
			}

			int mid = (start + end) / 2;
			if (nums[mid] == target) {
				result = mid;
				break;
			} else if (nums[mid] > target) {
				end = mid;
			} else if (nums[mid] < target) {
				start = mid;
			}
		}

		return result;
	}

	static class Laptop {
		Integer price;
		Integer quality;

		public Laptop(int price, int quality) {
			this.price = price;
			this.quality = quality;
		}
	}

	static class CustomComparator implements Comparator<Laptop> {
		public int compare(Laptop it1, Laptop it2) {
			if (it1.price == it2.price) {
				return it1.quality.compareTo(it2.quality);
			}
			return it1.price.compareTo(it2.price);
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("/Users/development/Devwork/Java/IdeaProjects/" +
            "JavaLearning/src/com/company/rough/input.txt"));

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		boolean result = false;
		List<Laptop> laptops = new ArrayList();

		for (int i=0; i<n; i++) {
			laptops.add(new Laptop(input.nextInt(), input.nextInt()));
		}
		Collections.sort(laptops, new CustomComparator());

//		for (Laptop element : laptops) {
//			System.out.println(element.price + " " + element.quality);
//		}

		for (int i=0; i<n-1; i++) {
			if (laptops.get(i).quality > laptops.get(i+1).quality) {
				result = true;
				break;
			}
		}

		// System.out.println(ans);
		if (result) {
			System.out.println("Happy Alex");
		} else {
			System.out.println("Poor Alex");
		}
	}
}
