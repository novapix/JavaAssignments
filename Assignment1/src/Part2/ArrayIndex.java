package Part2;

/*
 *  6. Write a Java program to find the index of an array element.
 */
import java.util.Scanner;

public class ArrayIndex {
	public static void main(String[] args) {

		int[] arr = { 55, 63, 90, 12, 66, 99, 33, 17, 18 };

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter num to find index of in the array: ");
		int num = sc.nextInt();

		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				index = i;
				break;
			}
		}

		if (index == -1) {
			System.out.println("Element not found in the array");
		} else {
			System.out.printf("Index of %d in array is: %d", num, index);
		}

		sc.close();
	}
}
