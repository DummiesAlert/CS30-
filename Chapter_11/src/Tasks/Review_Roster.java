package Tasks;

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


		File dataFile;
		String fileName;
		String firstName, lastName;
		BufferedWriter writeFile;
		int StuNum;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Name Of The File: ");
		fileName = input.nextLine();
		dataFile = new File(fileName);
		System.out.print("Enter The Number Of Students: ");
		StuNum = input.nextInt();

		try

		{
			FileOutputStream out = new FileOutputStream(dataFile);
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

			FileInputStream in = new FileInputStream(dataFile);
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

