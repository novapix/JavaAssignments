package Part2;

/*
2.⁠ ⁠Write a Java program to sum values of an array.
*/
public class ArraySum {

	public static void main(String[] args) {

		int[] num = { 55, 63, 90, 12, 66, 99, 33, 17, 18 };
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}

		System.out.printf("Sum of Array: %d%n", sum);
	}

}