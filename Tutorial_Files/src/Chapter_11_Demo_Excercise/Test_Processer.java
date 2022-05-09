package Chapter_11_Demo_Excercise;

import java.io.*;




import java.text.NumberFormat;


import java.util.*;







public class Test_Processer


{







	public static void main(String[] args)


	{


		


		Scanner input = new Scanner(System.in);


		NumberFormat pc = NumberFormat.getPercentInstance();


		


		File textFile;


		FileReader in;


		BufferedReader readFile;


		


		String fileName, masterAnswers, stuAnswers, stuName;


		int numCorrect;


		double percentCorrect;


		


		//obtain filename from user


		System.out.println("Enter the name of the test file: ");


		fileName = input.nextLine();


		


		//read file. display student name, and statistics


		textFile = new File(fileName);


		


		try


		{


			in = new FileReader(textFile);


			readFile = new BufferedReader(in);


			masterAnswers = (String)readFile.readLine();


			


			while((stuName = readFile.readLine()) != null)


			{


				stuAnswers = readFile.readLine();


				numCorrect = 0;







				for(int grade = 0; grade < masterAnswers.length(); grade++)


				{


					if(stuAnswers.charAt(grade) == masterAnswers.charAt(grade))


					{


						numCorrect = numCorrect + 1;


					}


				}


				percentCorrect = (double)numCorrect/masterAnswers.length();


				System.out.println(stuName + "\t" + pc.format(percentCorrect));


			}


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

