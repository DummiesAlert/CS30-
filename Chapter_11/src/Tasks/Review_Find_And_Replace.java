package Tasks;

import java.io.*;
import java.util.Scanner;

public class Review_Find_And_Replace {

	public static void main(String[] args) 
	{
		String fileName, searchText, replaceText;
		Scanner input = new Scanner(System.in);
		BufferedReader readFile;
		FileReader in;
		String replaced;
		
		System.out.print("Enter the Name of the File:");
		fileName = input.nextLine();
		
		File textFile = new File(fileName);
		
		try
		{
			System.out.println("What Letter/Word/Phrase would you like to replace?");
			searchText = input.nextLine();
			System.out.println("What Letter/Word/Phrase would you like to replace it with?");
			replaceText = input.nextLine();
		
			in = new FileReader(textFile);
			readFile = new BufferedReader(in);
			
			replaced = readFile.readLine();
			System.out.println(replaced);


			System.out.println("Replacing " + searchText + " with " + replaceText);
			System.out.println(replaced.replaceAll(searchText, replaceText));
			
			readFile.close();
			in.close();
		
		}catch(FileNotFoundException e)
		{
			System.out.println("File does not exist!");
			System.err.println("FileNotFoundException: "+ e.getMessage());
		}
		catch(IOException e)
		{
			System.out.println("Problem reading file.");
			System.err.println("IOException: "+ e.getMessage());
		}
		
		
		
		
	}

}	

/*

https://github.com/WillThompson1/CS_30.git
https://github.com/bennettpick/CS30bennett.git

*/