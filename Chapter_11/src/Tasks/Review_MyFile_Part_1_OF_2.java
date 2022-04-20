package Tasks;


import java.io.*;
import java.util.Scanner;

public static void main(String[] args)


		{

		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter the name of a file: ");
		String fileName = input.next();

			   File textFile = new File(fileName);

			   if(textFile.exists())

			   {

				System.out.println("File already exists.");

			   }

			   else

			   {

				System.out.println("File does not exist.");

			   }

		}

	}



}
