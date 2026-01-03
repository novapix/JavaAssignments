package Part1;

/*
 *  2.WAP to store and  print name of 6 cities.
 */
import java.util.Arrays;
import java.util.Scanner;

public class Cities {

	public static void main(String[] args) {
		
		String[] cityName = new String[6];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 6; i++) {
			System.out.println("Enter the name of city: ");
			cityName[i] = sc.nextLine();
		}
		System.out.println("Cities are: ");
		System.out.println(Arrays.toString(cityName));
		sc.close();
		
	}
}
