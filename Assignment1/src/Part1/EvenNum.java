package Part1;

/*
 * 4.WAP to store and print Even numbers from 1 to 100.
 */
import java.util.Arrays;

public class EvenNum {

	public static void main(String[] args) {

		int[] evenNum = new int[50];
		int j = 0;
		for (int i = 1; i <= 100; i++) {

			if (i % 2 == 0) {
				evenNum[j] = i;
				j++;
			}
		}

		System.out.println("Even Numbers from 1 to 100 are: ");
		System.out.println(Arrays.toString(evenNum));
	}
}
