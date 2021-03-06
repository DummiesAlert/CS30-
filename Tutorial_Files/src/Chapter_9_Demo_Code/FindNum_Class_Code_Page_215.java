package Chapter_9_Demo_Code;

/*
 * FindNum.java from Chapter 9
 * Finds the position of the number entered by the user.
 * Lawrenceville Press

 */

 import java.util.Scanner;
 import java.lang.Math;

 public class FindNum_Class_Code_Page_215 {

	public static void main(String[] args) {
		final int MAX = 20;
		int[] numArray = new int[MAX];
		Scanner input = new Scanner(System.in);
		int num, location;

		/* fill array with random numbers */
		for (int i = 0; i < numArray.length; i++) {
			numArray[i] = (int)((MAX + 1) * Math.random());
		}

		/* prompt user for a number to search for */
		System.out.print("Enter a number between 0 and " + MAX + ": ");
		num = input.nextInt();

		/* Search for number and notify user of num location */
		location = Search_Class_Code_Page_214.linear(numArray, num);
		if (location == -1) {
			System.out.println("Sorry, number not found in array.");
		} else {
			System.out.println("First occurrence is element " + location);
		}
	}
}