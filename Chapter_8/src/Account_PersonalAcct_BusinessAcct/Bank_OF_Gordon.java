package Account_PersonalAcct_BusinessAcct;

import java.util.Scanner;

public class Bank_OF_Gordon 

{

public static Customer assign() 

	{
		
		try (Scanner input = new Scanner(System.in)) { //Prompts User Inputs For Personal Account Details. 
			
			System.out.println("Welcome to Bank Of Gordon's Account Manager");
			
			//Name: 
			System.out.println("Please Enter your First Name: ");
			String Fn = input.next();
			
			System.out.println("Please Enter Your Last Name: ");
			String Ln = input.next();
			
			//Location of the User
			System.out.println("\nPlease Enter the Following Account Information");
			
			System.out.println("Enter City: ");
			String C = input.next();
			
			System.out.println("Enter State/Province: ");
			String S = input.next();
			
			System.out.println("Enter Street Address (In The Form: ### Address Cordin.): ");
			String s = input.next();
			       s+= input.nextLine();
			       
			System.out.println("Enter Postal Code (In The Form A#A#A#");
			String P = input.next();

			//Prompts all the Information to User They Inputed
			System.out.print("\nYour Finalized Account Details are Listed Below:");
			return new Customer(Fn, Ln, C, S , s, P);
			
		}
		
	}
		
		public static void main(String[] args) 
		
		{
			
			Customer cust;		
			cust = assign();
			System.out.println(cust);	

		}
	
}

/* Screen Dump

Run #1:

Welcome to Bank Of Gordon's Account Manager
Please Enter your First Name: 
Gordon
Please Enter Your Last Name: 
JJ

Please Enter the Following Account Information
Enter State/Province: 
Alberta
Enter City: 
Calgary
Enter Street Address (In The Form: ### Address): 
110 Garen Green Prom Drive NE
Enter Postal Code 
T4L 7V3

Your Finalized Account Details are Listed Below:Gordon JJ
Alberta
Calgary, 110 Garen Green Prom Drive NE  T4L

Run #2:

Please Enter your First Name: 
Gordon
Please Enter Your Last Name: 
JJ

Please Enter the Following Account Information
Enter City: 
Calgary
Enter State/Province: 

Alberta
Enter Street Address (In The Form: ### Address): 
110 Garen Green Prom Drive NE
Enter Postal Code (In The Form A#A#A#
T4L 7V3

Your Finalized Account Details are Listed Below:Gordon JJ
Calgary
Alberta, 110 Garen Green Prom Drive NE  T4L

Run #3:

Please Enter your First Name: 
Gordon
Please Enter Your Last Name: 
JJ

Please Enter the Following Account Information
Enter City: 
Calgary
Enter State/Province: 

Alberta
Enter Street Address (In The Form: ### Address): 
110 Garen Green Prom Drive NE
Enter Postal Code (In The Form A#A#A#
T4L7V3

Your Finalized Account Details are Listed Below:
Gordon JJ
Calgary, Alberta, 110 Garen Green Prom Drive NE  T4L7V3


 */
