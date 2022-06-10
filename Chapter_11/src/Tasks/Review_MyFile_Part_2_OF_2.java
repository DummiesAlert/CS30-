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

					textFile.createNewFile(); //Creates File
					System.out.println("New file created."); //Display Message That File Been Created


				}
			
				catch(IOException e) //Catch if the File Couldn't be Created Becasue of Already Exist or Maybe Just no. 

				{

					System.out.println("File could not be created.");
					System.err.println("IOException: " + e.getMessage());
				}

				System.out.println("\\ Keep File \\ Delete"); //Prompt the User if They Want to Keep or Delete the File.
				String action = input.next();
								
				if(action.equalsIgnoreCase("K")) //If User Entered is "k" Then the File is Kept
				{

					textFile.exists();
					System.out.println("The file has been kept.");
				}
				else if(action.equalsIgnoreCase("D")) //If User Entered is "d" Then Deletes File
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
