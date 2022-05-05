package Tasks;

/*

Program: Review_MyFile_Part_1_OF_2.java          Last Date of this Revision: May 5,2022

Purpose: Create a MyFile application that prompts the user for the name of a file and then displays a message that
indicates whether the files exists or not. Note that if the user types in a full path, any single backslashes (\)
will need to be replaced with an escape sequence(\\) in order to create a new File object.

Author: Zhuo Xi Hong 
School: CHHS
Course: Computer Programming 30
 

*/

import java.io.*;
import java.util.Scanner;

public class Review_MyFile_Part_1_OF_2 {
	
public static void main(String[] args) 


		{

		Scanner input = new Scanner(System.in);
		
		System.out.print("Please Enter the name of a file: ");
		String fileName = input.next();

			   File textFile = new File(fileName);

			   if(textFile.exists())

			   {

				System.out.println("File already exists.");

			   }

			   else

			   {

				System.out.println("File does not exist.");

			   }

		}

}

/* Screen Dump

Run #1:

Please Enter the name of a file: FAR.txt
File already exists.

Run #2: 

Please Enter the name of a file: FAR
File does not exist.


 
 */