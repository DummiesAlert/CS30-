package Tasks;

/*

Program: Review_Stats_Part_1_OF_2.java          Last Date of this Revision: May 5, 2022

Purpose: Create a Stats application that reads names and scores from a data file named Student_Bad_Grades.txt, supplied with this
text. The file contains a student name on one line followed by the student’s test score on the next line. The
Stats application should read and display each name and score. After all the scores have been displayed, the
lowest score, highest score, and average score should be displayed.

Author: Zhuo Xi Hong, 
School: CHHS
Course: Computer Programming 30

*/

import java.io.*;

public class Review_Stats_Part_1_OF_2 

/*
Use Grade.txt
*/

{
	public static void main(String[] args)


	
	{

		File dataFile = new File("C:\\Users\\904273001\\git\\CS30-\\Chapter_11\\Grade.txt");
		FileReader in;
		BufferedReader readFile;
		String StuName, Score;
		double scoreValue = 0;
		double lowScore = 100;
		double highScore = 0;
		double AvgScore = 0;
		double totalScore = 0;
		int numScores = 0;
		
		try
		{
			
			in = new FileReader(dataFile);
			readFile = new BufferedReader(in);
			
			while((StuName = readFile.readLine()) != null)
			{
				Score = readFile.readLine();
				System.out.println(StuName + " " + Score);
				numScores += 1;
				scoreValue = Double.parseDouble(Score);
				totalScore += scoreValue;
				
				if(scoreValue < lowScore)
				{
					lowScore = scoreValue;
				}
				if(scoreValue > highScore)
				{
					highScore = scoreValue;
				}
				
			}//while loop
			
			AvgScore = totalScore / numScores;
			System.out.println("Lowest Score: " + lowScore);
		System.out.println("Highest Score: " + highScore);
		System.out.println("Average Score: " + AvgScore);
			readFile.close();
			in.close();
		}
		
		catch(FileNotFoundException e)
		
		{
			System.out.println("File does not exist!");
			System.err.println("FileNotFoundException: "+ e.getMessage());
		}
		catch(IOException e)
		
		{
			System.out.println("File does not exist!");
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
Highest Score: 100.0
Average Score: 58.5
 
 */


