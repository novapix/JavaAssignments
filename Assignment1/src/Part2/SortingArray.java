package Part2;
/*
 * 1. Write a Java program to sort a numeric array and a string array.
 */

import java.util.Arrays;

public class SortingArray {
	public static void main(String[] args) {
		int[] scores = { 23, 5, 78, 12, 34, 66, 1, 49, 8, 90, 3 };
		String[] subjects = { "Physics", "Chemistry", "Biology", "History", "Geography" };

		System.out.println("Before Sorting:");
		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(subjects));

		Arrays.sort(scores);
		Arrays.sort(subjects);

		System.out.println("After Sorting:");
		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(subjects));
	}
}
