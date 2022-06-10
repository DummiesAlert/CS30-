package Tasks;

/*

Program: Review_Stats_Part_1_OF_2.java          Last Date of this Revision: May 5, 2022

Purpose: Create a Stats application that reads names and scores from a data file named Student_Bad_Grades.txt, 
supplied with this text. The file contains a student name on one line followed by the student’s test score on the next line. 
The Stats application should read and display each name and score. After all the scores have been displayed, the
lowest score, highest score, and average score should be displayed.

Author: Zhuo Xi Hong, 
School: CHHS
Course: Computer Programming 30

*/

import java.io.*;

public class Review_Stats_Part_1_OF_2 

/*
	Uses Grade.txt
*/

{
	public static void main(String[] args)

	/*

		Recognize the file C:\\Users\\904273001\\git\\CS30-\\Chapter_11\\Grade.txt inside the java project and creates 
		variables couble and int and strings to be used to read the file and store the data into them. 

	*/
	
	{

		File dataFile = new File("C:\\Users\\904273001\\git\\CS30-\\Chapter_11\\Grade.txt"); //Recognize the File Within a Specific Place
		FileReader in; //Find file
		BufferedReader readFile; //Read File
		String StuName, Score; //Create String 
		double scoreValue = 0; //Create Double
		double lowScore = 100; //Create Double
		double highScore = 0; //Create Double
		double AvgScore = 0; //Create Double
		double totalScore = 0; //Create Double
		int numScores = 0; //Create Int
		
		try
		{
			
			in = new FileReader(dataFile);
			readFile = new BufferedReader(in);
			
			/*
			  
				Does the math to calculate the highest grade and lowest grade within the file and stores them into the 
				Score and StuName. And also displays all the names and scores of students in the file in an list, way. 
				
			*/

			while((StuName = readFile.readLine()) != null) //While loop
			{
				Score = readFile.readLine(); //Use Grades in the Specific File
				System.out.println(StuName + " " + Score);
				numScores += 1; //Calculate how Many Grades are There
				scoreValue = Double.parseDouble(Score);
				totalScore += scoreValue; //Creates Average of the Grades
				
				if(scoreValue < lowScore) //Determines the Lowest Grade
				{
					lowScore = scoreValue;
				}
				if(scoreValue > highScore) //Determines the Highest Grade
				{
					highScore = scoreValue;
				}
				
			}
			
			AvgScore = totalScore / numScores;
			
			/*
			 * 
				Displays the results to the user. 
				
			*/

			System.out.println("Lowest Score: " + lowScore);
			System.out.println("Highest Score: " + highScore);
			System.out.println("Average Score: " + AvgScore);
			readFile.close();
			in.close();
		}
		
		/*
		
			Catchs for errors like if the file doesn't exist in the java project or that
			the file is in the wrong area and can not be read. 
		
		*/

		catch(FileNotFoundException e)
		
		{
			System.out.println("File does not exist!"); //File Doesn't Exist
			System.err.println("FileNotFoundException: "+ e.getMessage());
		}
		catch(IOException e)
		
		{
			System.out.println("File does not exist!"); //File Doesn't Exist 2
			System.err.println("IOException: "+ e.getMessage());
		}
			
	}
}

/* Screen Dump
 
Run #1:

Zac 0
Alisha 96
Abdalla 100
Zacie 88
Gordon  24
Chemie 43
Lowest Score: 0.0
Highest Score: 0.0
Average Score: 0.0
 
Run #2: 

Zac 0
Alisha 96
Abdalla 100
Zacie 88
Gordon  24
Chemie 43
Lowest Score: 0.0
Highest Score: 100.0
Average Score: 58.5
 
 */
