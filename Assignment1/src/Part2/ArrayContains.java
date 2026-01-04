package Part2;

/*
 * 5.⁠ ⁠Write a Java program to test if an array contains a specific value.
 */
public class ArrayContains {
	public static void main(String[] args) {

		int[] numbers = { 55, 63, 90, 12, 66, 99, 33, 17, 18 };
		int value = 99;

		boolean found = false;

		for (int num : numbers) {
			if (num == value) {
				found = true;
				break;
			}
		}

		System.out.println(found ? "Array contains the value: " + value : "Value not found");

	}
}
