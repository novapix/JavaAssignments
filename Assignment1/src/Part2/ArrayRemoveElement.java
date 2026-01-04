package Part2;

/*
 7.Write a Java program to remove a specific element from an array.
 */
import java.util.Arrays;
import java.util.Scanner;

public class ArrayRemoveElement {

	public static void main(String[] args) {

		int[] arr = { 55, 63, 90, 12, 66, 99, 33, 17, 18 };
		int[] nums = new int[arr.length - 1];

		Scanner sc = new Scanner(System.in);

		System.out.println(Arrays.toString(arr));

		System.out.print("Enter the element to remove from the array: ");
		int num = sc.nextInt();

		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (num != arr[i]) {
				nums[j++] = arr[i];
			}
		}

		System.out.printf("Array after removing %d: ", num);
		for (int x : nums) {
			System.out.print(x + " ");
		}
		sc.close();

	}

}