package Tasks;

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


		


		}catch (IOException e)


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

