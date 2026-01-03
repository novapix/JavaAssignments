package Part1;

import java.util.Scanner;

/*
 * 1. WAP to store and print total, average price of 10 books
 */
public class BookAverage {
	public static void main(String[] args) {
		
		double[] price = new double[10];
		
		Scanner sc = new Scanner(System.in);
		
		
		for(int i = 0; i < 10; i++) {
			System.out.printf("Enter the price of book %d:",i+1);
			price[i] = sc.nextDouble();
		}
		
		int total = 0;
		double average = 0;
		
		for(int i=1; i < 10; i++) {
			total += price[i];
		}
		average = (double)total / price.length;
		
		System.out.printf("Total price of 10 books: %d%n", total);
		System.out.printf("Average price of 10 books: %.2f%n", average);

	}
}
