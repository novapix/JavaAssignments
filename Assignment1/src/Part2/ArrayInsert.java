package Part2;

import java.util.Scanner;

/*
 * 9. Write a Java program to insert an element (specific position) into an array.
 */
public class ArrayInsert {
	public static void main(String[] args) {

		int[] arr = { 30, 55, 333, 66, 77, 0, 0, 0, 0, 0 };
		int n = 5;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter element to insert: ");
		int num = sc.nextInt();
		System.out.printf("Enter position (0 to %d): ", n);
		int pos = sc.nextInt();

		for (int i = n; i > pos; i--) {
			arr[i] = arr[i - 1];
		}

		arr[pos] = num;
		n++;

		System.out.print("Array after insertion: ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

		sc.close();
	}
}
