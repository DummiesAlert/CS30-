package Tasks;


/*

Program: Review_Stats_Part_2_OF_2.java          Last Date of this Revision: May 5, 2022

Purpose: Modify the Stats application to allow the user to enter the names and grades of the students. The user should
be prompted for the name of the file to create and for the number of student grades that will be entered.
After the data has been entered and the written to a file, the file should be read and the lowest, highest, and
average score displayed.

Author: Zhuo Xi Hong, 
School: CHHS
Course: Computer Programming 30

*/

import java.io.*;
import java.text.NumberFormat;
import java.util.Scanner;

	/*
 
		Uses Grade2.txt

	*/
public class Review_Stats_Part_2_OF_2 

{

	/*
	  
		Prepares to read and write into the file, in and out, then uses .getPercentInstance(); and create 
		Strings, doubles and ints to store and the program does math later. 
	
	*/
	
	public static void main(String[] args)

	{
		File dataFile; 
		FileWriter out; //Write Data Out
		FileReader in; //Read in
		BufferedWriter writeFile; //Ready to Write Into the file
		BufferedReader readFile; //Ready to Read the File
		
		Scanner input = new Scanner(System.in);
		NumberFormat num = NumberFormat.getPercentInstance(); //For Percent Math 
		String StuName; //Create String
		String Score; //Create String
		String fileName; //Create String
		double scoreValue = 0; //Create Double
		double lowScore = 100; //Create Double
		double highScore = 0; //Create Double
		double AvgScore = 0; //Create Double
		double totalScore = 0; //Create Double
		int numScores = 0; //Create Int
		int StuNum; //Create Int

		System.out.print("Enter the name Of The File: "); //Prompts for file name inside the java project 
		fileName = input.next();

		System.out.print("Enter The Number Of Students: "); //Prompts for the number of students 
		StuNum = input.nextInt();

		try
		
		{
			dataFile = new File(fileName);
			out = new FileWriter(dataFile);
			writeFile = new BufferedWriter(out);

			for (int i = 0; i < StuNum; i++) //Loop as to how many students were entered above, and repeats the amount of times asked. 

			{

				System.out.print("Enter Student Name: "); //Prompt User for Student Name 
				StuName = input.next();

				System.out.print("*Note the Test Grade is Out of 1, "); //Tells the User That the Test Total is Out of 1
				System.out.print("Enter Test Score: "); //Prompt User for Test Score
				Score = input.next();

				//Reads and writes into the file
				
				writeFile.write(StuName);
				writeFile.newLine();

				writeFile.write(String.valueOf(Score));
				writeFile.newLine();
			}

			writeFile.close();
			out.close();
			System.out.println("Data Written To File."); //Tells user the data is written into the file.

		}
		
			catch (IOException e)

		{

			System.out.println("Problem Writing To File."); //Problem Writing in the File
			System.err.println("IOException: " + e.getMessage());


		}

			try

			{
				//Read file
				
				dataFile = new File(fileName);
				in = new FileReader(dataFile);
			    	readFile = new BufferedReader(in);

			    /*
				  
				Does the math to calculate the highest grade and lowest grade within the file and stores them into the 
				Score and StuName. And also displays all the names and scores of students in the file in an list, way. 
				
			    */
			    
			    while((StuName = readFile.readLine()) != null) //While Loop
			    	{

				Score = readFile.readLine();
				System.out.println(StuName + " " + Score); //Displays Each Students Name With There Grade

				numScores += 1; //Numbers Each Score
				scoreValue = Double.parseDouble(Score);
				totalScore += scoreValue;
				
				numScores += 1; //Numbers Each Score
				totalScore += scoreValue;

				   if(scoreValue < lowScore) //Finds Lowest Grade

				     {
					     lowScore = scoreValue;
				     }

				   if(scoreValue > highScore) //Find Highest Grade

				     {
					     highScore = scoreValue;
				     }
				   
			    	}

			AvgScore = totalScore / numScores; //Determines the highest score
			
			//Prints out the results to the user
			System.out.println("Lowest Score: " + num.format(lowScore));
			System.out.println("Highest Score: " + num.format(highScore));
			System.out.println("Average Score: " + num.format(AvgScore));
		
		} catch (IOException e)

		{

			System.out.println("Problem Writing To File."); //Cannot Write Into the file
			System.err.println("IOException: " + e.getMessage());
				
		}
	}
}

/* Screen Dump
 
Run #1: 

Enter the name Of The File: Grade2.txt
Enter The Number Of Students: 2
Enter Student Name: f
Enter Test Score: 42
Enter Student Name: g
Enter Test Score: 35
Data Written To File.
f 42
g 35
Lowest Score: 3,500%
Highest Score: 4,200%
Average Score: 3,850%

Run #2: 

Enter the name Of The File: Grade2.txt
Enter The Number Of Students: 2
Enter Student Name: f
Enter Test Score: 3.0
Enter Student Name: d
Enter Test Score: 2.0
Data Written To File.
f 3.0
d 2.0
Lowest Score: 200%
Highest Score: 300%
Average Score: 250%

Run #3: 

Enter the name Of The File: Grade2.txt
Enter The Number Of Students: 2
Enter Student Name: s
Enter Test Score: 0.4
Enter Student Name: d
Enter Test Score: 0.3
Data Written To File.
s 0.4
d 0.3
Lowest Score: 30%
Highest Score: 40%
Average Score: 35%

Run #4;

Enter the name Of The File: Grade2.txt
Enter The Number Of Students: 1
Enter Student Name: f
*Note the Test Grade is Out of 1, Enter Test Score: 0.2
Data Written To File.
f 0.2
Lowest Score: 20%
Highest Score: 20%
Average Score: 20%

 */
