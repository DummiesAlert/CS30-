package Tasks;

/*

Program: Review_Roster.java          Last Date of this Revision: May 5, 2022

Purpose: Create a Roster application that prompts the user for the name of the file to store student names and then
prompts the user for the number of students in a class. The application should then prompt the user for
the first and last name of each student and write this data to a file. After all the data is written to a file, the
application display the class Roster with one name after the other in a list. Create a StuName class that has
member variables firstName and lastName and a toString() member method.

Author: Zhuo Xi Hong, 
School: CHHS
Course: Computer Programming 30
 

*/

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Review_Roster extends Student_Name

/*

	 Uses Grade2.txt

*/

{

	public Review_Roster(String fn, String ln) //Extends and Inherits Student_Name Into This Class and Super the fn and ln Values Into the Class.

	{
		super(fn, ln);
	}
	
	public static void main(String[] args)

	{


		String fileName; //Create Strings 
		String firstName, lastName; //Create Strings 
		int StuNum; //Create int for Non-decimal
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Name Of The File: "); //Prompt User for Name of the File
		fileName = input.nextLine();
		System.out.print("Enter The Number Of Students: "); //Prompt User for the Number of Students
		StuNum = input.nextInt();

		try

		{
			FileOutputStream out = new FileOutputStream(fileName); //Use File
			ObjectOutputStream writeStu = new ObjectOutputStream(out); //To Write Into the File
			
			for (int i = 0; i < StuNum; i++) //Based off of how Many Students Were Entered 

			{

				System.out.print("Enter the Student's First Name: "); //Ask for First Name
				firstName = input.next(); //Store 
				System.out.print("Enter the Student's Last Name: "); //Ask for Last Name
				lastName = input.next(); //Store 
				writeStu.writeObject(new Student_Name(firstName, lastName)); //Write all Information Into the File

			}

			writeStu.close();
			out.close();

			System.out.println("Data Written To File."); //Displays the user that the information is successfully written in the code.

			FileInputStream in = new FileInputStream(fileName);
			ObjectInputStream readStuName = new ObjectInputStream(in);

			for(int i = 0; i < StuNum; i++) //Used to repeat the amount of times it asks for the first and last name
				
			{

			System.out.println((Student_Name)readStuName.readObject());

			}                 

			readStuName.close();

			/*

			 	To catch exceptions like user input does'nt meet requirements or the file couldn't be found or that
			 	the information the user inputed object can not be displayed in the file.

			*/
			
		}catch (FileNotFoundException e)

		{
			System.out.println("File Could Not Be found."); //File not Found
			System.err.println("FileNotFoundException: " + e.getMessage());
		}

		catch(IOException e)
		
		{
			System.out.println("Problem with input/output"); //User Input is not Found
			System.err.println("IOException: " + e.getMessage());
		}

		catch(ClassNotFoundException e)

		{
			System.out.println("Class could not be used to cast object."); //Cannot Find the Class 
			System.err.println("ClassNotFoundException: " + e.getMessage());
		}
	}
}

/* Screen Dump

Run #1: 

Enter the Name Of The File: Student_Bad_Grades.txt
Enter The Number Of Students: 2
Enter the Student's First Name: f
Enter the Student's Last Name: d
Enter the Student's First Name: s
Enter the Student's Last Name: a
Data Written To File.
f d
s a

Run #2:

Enter the Name Of The File: Student_Bad_Grades.txt
Enter The Number Of Students: 3
Enter the Student's First Name: f
Enter the Student's Last Name: d
Enter the Student's First Name: s
Enter the Student's Last Name: a
Enter the Student's First Name: b
Enter the Student's Last Name: q
Data Written To File.
f d
s a
b q
 
 */
