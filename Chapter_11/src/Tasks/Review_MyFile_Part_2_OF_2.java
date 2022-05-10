package Tasks;

/*

Program: Review_MyFile_Part_2_OF_2.java          Last Date of this Revision: May 5, 2022

Purpose: Create a MyFile application that creates a file named zzz.txt and then displays a message indicating that the
file has been created. The application should prompt the user to either keep or delete the file. If the file is
deleted, a message should notify the user when the file has been successfully deleted.

Author: Zhuo Xi Hong, 
School: CHHS
Course: Computer Programming 30

*/

import java.io.*;
import java.util.Scanner;

public class Review_MyFile_Part_2_OF_2 
{

	public static void main(String[] args)
	{
	

		File textFile = new File("abcd.txt"); //Creates file name 

		try (Scanner input = new Scanner(System.in)) {
			try


				{

					textFile.createNewFile(); //Creates file
					System.out.println("New file created."); //Display message that file been created


				}
			
				catch(IOException e) //Catch if the file couldn't be created becasue of already exist or maybe just no. 

				{

					System.out.println("File could not be created.");
					System.err.println("IOException: " + e.getMessage());
				}

				System.out.println("\\ Keep File \\ Delete"); //Prompt the user if they want to keep or delete the file.
				String action = input.next();
				
				//Displays the user if the file is kept or deleted based of the users input above. 
				
				if(action.equalsIgnoreCase("K"))
				{

					textFile.exists();
					System.out.println("The file has been kept.");
				}
				else if(action.equalsIgnoreCase("D"))
				{
					textFile.delete();
					System.out.println("The file has been deleted.");
					
				}
		}
		
	}
}




/* Screen Dump
 
Run #1: 

New file created.
\ Keep File \ Delete
k
The file has been kept.

Run #2: 

New file created.
\ Keep File \ Delete
d
The file has been deleted.

 
 */
