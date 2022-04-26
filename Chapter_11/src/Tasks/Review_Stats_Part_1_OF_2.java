package Tasks;

import java.io.*;

public class Review_Stats_Part_1_OF_2 

{
	public static void main(String[] args)


	{

		File dataFile = new File("C:\\Users\\904273001\\git\\CS30-\\Chapter_11\\src\\Tasks\\zzz.txt");
		
		FileReader in;
		BufferedReader readFile;
		String StuName, Score;
		double scoreValue = 0;
		double lowScore = 100;
		double highScore = 0;
		double AvgScore;
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

				if(scoreValue < lowScore)

				{

					lowScore = scoreValue;

				}

				else if(scoreValue > highScore)


				{

					highScore = scoreValue;

				}

			}//while loop
			
			readFile.close();
			in.close();

		}catch(FileNotFoundException e)

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


