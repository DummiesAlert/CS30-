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


{

	public Review_Roster(String fn, String ln)

	{
		super(fn, ln);
	}


	public static void main(String[] args)

	{


		String fileName;
		String firstName, lastName;
		int StuNum;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Name Of The File: ");
		fileName = input.nextLine();
		System.out.print("Enter The Number Of Students: ");
		StuNum = input.nextInt();

		try

		{
			FileOutputStream out = new FileOutputStream(fileName);
			ObjectOutputStream writeStu = new ObjectOutputStream(out);
			
			for (int i = 0; i < StuNum; i++)

			{

				System.out.print("Enter the Student's First Name: ");
				firstName = input.next();
				System.out.print("Enter the Student's Last Name: ");
				lastName = input.next();
				writeStu.writeObject(new Student_Name(firstName, lastName));

			}

			writeStu.close();

			//out.close();

			System.out.println("Data Written To File.");

			FileInputStream in = new FileInputStream(fileName);
			ObjectInputStream readStuName = new ObjectInputStream(in);

			for(int i = 0; i < StuNum; i++)
				
			{

			System.out.println((Student_Name)readStuName.readObject());

			}                 

			readStuName.close();


		}catch (FileNotFoundException e)

		{
			System.out.println("File Could Not Be found.");
			System.err.println("FileNotFoundException: " + e.getMessage());
		}

		catch(IOException e)
		
		{
			System.out.println("Problem with input/output");
			System.err.println("IOException: " + e.getMessage());
		}

		catch(ClassNotFoundException e)

		{
			System.out.println("Class could not be used to cast object.");
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
