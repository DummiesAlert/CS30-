package Chapter_9_Demo_Code;

/*
 * CountLetters.java from Chapter 9
 * Count the occurences of letters in a string.
 * Lawrenceville Press

 */

 /**
  * The occurences of letters in a string are counted.
  */

 import java.util.Scanner;

 public class CountLetters_Class_Code_Page_212 {

	public static void main(String[] args) {
		final int LOW = 'A';		//smallest possible value
		final int HIGH = 'Z';		//highest possible value
		int[] letterCounts = new int[HIGH - LOW + 1];
		Scanner input = new Scanner(System.in);
		String word;
		char[] wordLetters;
		int offset;		//array index

		/* prompt user for a word */
		System.out.print("Enter a word: ");
		word = input.nextLine();

		/* convert word to char array and count letter occurrences */
		word = word.toUpperCase();
		wordLetters = word.toCharArray();
		for (int letter = 0; letter < wordLetters.length; letter++) {
			offset = wordLetters[letter] - LOW;
			letterCounts[offset] += 1;
		}

		/* show letter occurrences */
		for (int i = LOW; i <= HIGH; i++) {
			System.out.println((char)i + ": " + letterCounts[i - LOW]);
		}
	}
}