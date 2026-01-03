package Part1;
/*
 * 3.WAP to store and print odd numbers from 1 to 100.
 */
import java.util.Arrays;

public class OddNum {
	public static void main(String[] args) {

		int[] oddNum = new int[50];
		int j = 0;
		for (int i = 1; i <= 100; i++) {

			if (i % 2 != 0) {
				oddNum[j] = i;
				j++;
			}
		}

		System.out.println("Odd Numbers from 1 to 100 are: ");
		System.out.println(Arrays.toString(oddNum));
	}
}
