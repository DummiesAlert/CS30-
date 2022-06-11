/*
Program: Gordon_Vcars.java          Last Date of this Revision: June 9 2022

Purpose: Create a Vehicle class that is an abstract class defining the general details and 
		 actions associated with a vehicle. Create Car, Truck, and Minivan classes that inherit 
		 the Vehicle class. The Car, Truck, and Minivan classes should include additional 
		 members specific to the type of vehicle being represented. Create client code to test 
		 the classes.

Author: Zhuo Xi Hong
School: CHHS
Course: Computer Programming 30
 
*/

package Gordon_Vcars;

import java.util.Scanner;

public class Gordon_Vcars 
{

	public static void main(String[] args)
	{

		String action;
		do 
		{

			try ( //Check Labigungun, Trucc_Kun, Minibun, or QUIT
			Scanner input = new Scanner(System.in)) {
				System.out.println("Would You Like To Check Labigungun (C) Or Trucc_Kun (T) Or Minibun (M) Or Quit(Q)"); //Prompt For Choice
				System.out.println("Enter Choice: ");
				action = input.next();
			}
			
			//Check Labigungun
			if (action.equalsIgnoreCase("C") || (action.equalsIgnoreCase("Car"))) 
			{
				
				Labigungun s = new Labigungun (28,36,5,60); //Assign Variable
				System.out.println(s.toString()); //Display Stored (s)
				
			}

			//Check Trucc_Kun
			if (action.equalsIgnoreCase("T") || (action.equalsIgnoreCase("Truck"))) 
			{
				
				Trucc_Kun t = new Trucc_Kun(14,18,5,89); //Assign Variable
				System.out.println(t.toString()); //Display Stored (t)
				
			}

			//Check Minibun
			if (action.equalsIgnoreCase("M") || (action.equalsIgnoreCase("Minivan"))) 
			{
				
				Minibun m = new Minibun(30,35,8,140); //Assign Variable
				System.out.println(m.toString()); //Display Stored (m)

			}
		}
		
		//QUIT
		while (action.equalsIgnoreCase("Q") || (action.equalsIgnoreCase("Quit")));
		
	}
}

/*

Run #1: 

Would You Like To Check Labigungun (C) Or Trucc_Kun (T) Or Minibun (M) Or Quit(Q)
Enter Choice: 
c
Fuel Economy in the City is: 28 Miles Per Gallon
Fuel Economy on the Highway is: 36 Miles Per Gallon
The Vehicle has 5 Seats 
Cargo Volume of the Car is: 60.0 Cubic Feet
 N/A


Run #2: 

Would You Like To Check Labigungun (C) Or Trucc_Kun (T) Or Minibun (M) Or Quit(Q)
Enter Choice: 
t
Fuel Economy in the city is: 14 Miles Per Gallon
Fuel Economy on the Highway is: 18 Miles Per Gallon
The Vehicle has 5 Seats 
Cargo Volume of the Car is: 89.0 Cubic Feet
 N/A

Run #3: 

Would You Like To Check Labigungun (C) Or Trucc_Kun (T) Or Minibun (M) Or Quit(Q)
Enter Choice: 
m
Fuel Economy in the City is: 30 Miles Per Gallon
Fuel Economy on the Highway is: 35 Miles Per Gallon
The Vehicle has 8 Seats 
Cargo Volume of the Car is: 140.0 Cubic Feet
 N/A
 
Run #4:

Would You Like To Check Labigungun (C) Or Trucc_Kun (T) Or Minibun (M) Or Quit(Q)
Enter Choice: 
q

Exception in thread "main" java.util.NoSuchElementException
	at java.base/java.util.Scanner.throwFor(Scanner.java:937)
	at java.base/java.util.Scanner.next(Scanner.java:1478)
	at Gordon_Vcars.Gordon_Vcars.main(Gordon_Vcars.java:34)
	
*/