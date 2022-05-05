package Tasks;

	import java.io.*;
	import java.util.Scanner;

	public class Review_Roster_2 {
	/* name of file is Student_Scores
	reads and write to file
	asks for file name and number of students
	*/
	public static void main(String[] args)
	{
	String fileName;
	Scanner input = new Scanner(System.in);
	FileReader in;
	BufferedReader readFile;
	BufferedWriter writeFile;
	String firstName, lastName;
	int stuNum;
	Double stuAmount;

	System.out.print("Enter the name of the test file:");
	fileName = input.nextLine();
	System.out.println("How Many Students?");
	stuNum = input.nextInt();
	File textFile = new File(fileName);

	//reads and writing to file
	try
	{
	FileOutputStream out = new FileOutputStream(textFile);
	ObjectOutputStream writeStu = new ObjectOutputStream(out);

	//asks for first and last names of students depending on the number user inputs
	//stores it in stuName.java class
	for(int i = 0; i < stuNum; i++)
	{
	System.out.println("Enter Student First Name");
	firstName = input.next();
	System.out.println("Enter Student Last Name");
	lastName = input.next();

	writeStu.writeObject(new Student_Name(firstName, lastName));
	}
	writeStu.close();

	System.out.println("Data has been written to file.");


	//Read Objects page 289
	//Create FileInputStream
	//Create ObjectInputSrea

	FileInputStream in1 = new FileInputStream(textFile);
	ObjectInputStream readStu = new ObjectInputStream(in1);


	for(int i = 0; i < stuNum; i++)
	{
	System.out.println((Student_Name)readStu.readObject());
	}
	readStu.close();
	 
	}catch(FileNotFoundException e)
	{
	System.out.println("File does not exist!");
	System.err.println("FileNotFoundException: "+ e.getMessage());
	}
	catch(IOException e)
	{
	System.out.println("Problem reading file.");
	System.err.println("IOException: "+ e.getMessage());
	} catch (ClassNotFoundException e)
	{
	// TODO Auto-generated catch block
	e.printStackTrace();
	}

	}

	}

	/* Screen Dump


	Enter the name of the test file:test2.txt
	How Many Students?
	2
	Enter Student First Name
	Sam
	Enter Student Last Name
	Sung
	Enter Student First Name
	Crystal
	Enter Student Last Name
	Johnson
	Data has been written to file.
	Sam Sung
	Crystal Johnson

*/
