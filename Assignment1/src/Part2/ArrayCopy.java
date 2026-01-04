package Part2;
/*
 * 8. Write a Java program to copy an array by iterating the array.
 */
public class ArrayCopy {
	public static void main(String[] args) {

		int[] num = { 55, 63, 90, 12, 66, 99, 33, 17, 18 };

		int[] copy = new int[num.length];

		for (int i = 0; i < num.length; i++) {
			copy[i] = num[i];
		}

		System.out.print("Copied array: ");
		for (int x : copy) {
			System.out.print(x + " ");
		}

	}
}
