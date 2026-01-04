package Part2;

/*
 * 4. Write a Java program to calculate the average value of array elements.
 */

public class ArrayAverage {

	public static void main(String[] args) {

		int[] num = { 55, 63, 90, 12, 66, 99, 33, 17, 18 };
		int sum = 0;

		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		double avg = (double)sum / num.length;

		System.out.println("Average: " + avg);
	}
}
