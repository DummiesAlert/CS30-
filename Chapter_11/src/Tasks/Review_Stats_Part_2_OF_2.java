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

public class Review_Stats_Part_2_OF_2 

{

	public static void main(String[] args)

	{
		File dataFile;
		FileWriter out;
		FileReader in;
		BufferedWriter writeFile;
		BufferedReader readFile;
		
		Scanner input = new Scanner(System.in);
		NumberFormat num = NumberFormat.getPercentInstance();
		String StuName;
		String Score;
		String fileName;
		double scoreValue = 0;
		double lowScore = 100;
		double highScore = 0;
		double AvgScore = 0;
		double totalScore = 0;
		int numScores = 0;
		int StuNum;

		System.out.print("Enter the name Of The File: ");
		fileName = input.next();

		System.out.print("Enter The Number Of Students: ");
		StuNum = input.nextInt();

		try
		
		{

			dataFile = new File(fileName);
			out = new FileWriter(dataFile);
			writeFile = new BufferedWriter(out);

			for (int i = 0; i < StuNum; i++)

			{

				System.out.print("Enter Student Name: ");
				StuName = input.next();

				System.out.print("*Note the Test Grade is Out of 1, ");
				System.out.print("Enter Test Score: ");
				Score = input.next();

				writeFile.write(StuName);
				writeFile.newLine();

				writeFile.write(String.valueOf(Score));
				writeFile.newLine();
			}

			writeFile.close();
			out.close();
			System.out.println("Data Written To File.");

		}
		
			catch (IOException e)

		{

			System.out.println("Problem Writing To File.");
			System.err.println("IOException: " + e.getMessage());


		}

			//read file
			try

			{
				dataFile = new File(fileName);
				in = new FileReader(dataFile);
			    readFile = new BufferedReader(in);

			    while((StuName = readFile.readLine()) != null)

			    	{

				Score = readFile.readLine();

				System.out.println(StuName + " " + Score);


				numScores += 1;
				scoreValue = Double.parseDouble(Score);
				totalScore += scoreValue;
				
				numScores += 1;
				totalScore += scoreValue;

				   if(scoreValue < lowScore)

				     {
					     lowScore = scoreValue;
				     }

				   if(scoreValue > highScore)

				     {
					     highScore = scoreValue;
				     }
				   
			    	}

			AvgScore = totalScore / numScores;

		System.out.println("Lowest Score: " + num.format(lowScore));
		System.out.println("Highest Score: " + num.format(highScore));
		System.out.println("Average Score: " + num.format(AvgScore));
		
		} catch (IOException e)

		{

			System.out.println("Problem Writing To File.");
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