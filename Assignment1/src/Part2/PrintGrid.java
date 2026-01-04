package Part2;

/*

3.⁠ ⁠Write a Java program to print the following grid.

Expected Output :

 ⁠- - - - - - - - -                                                                                           
 ⁠- - - - - - - - -                                                                                           
 ⁠- - - - - - - - -                                                                                           
 ⁠- - - - - - - - -                                                                                           
 ⁠- - - - - - - - -                                                                                           
⁠- - - - - - - - -                                                                                           
 ⁠- - - - - - - - -                                                                                           
 ⁠- - - - - - - - -                                                                                           
 ⁠- - - - - - - - -                                                                                           
 ⁠- - - - - - - - -  

*/

public class PrintGrid {
	public static void main(String[] args) {

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print("- ");
			}
			System.out.println();
		}
	}
}
