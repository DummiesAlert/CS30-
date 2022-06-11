/*
Program: Bank_Of_Gordon.java          Last Date of this Revision: June 9 2022

Purpose: Create PersonalAcct and BusinessAcct classes that inherit the Account class presented in Chapter 8. 
		 A personal account requires a minimum balance of $100. If the balance falls below this amount, then 
		 $2.00 is charged (withdrawn) to the account. A business account requires a minimum balance of $500, 
		 otherwise the account is charged $10. Create client code to test the classes.

Author: Zhuo Xi Hong
School: CHHS
Course: Computer Programming 30
 
*/

package Bank_of_Gordon;

import java.util.Scanner;

public class Bank_Of_Gordon extends Account //MyBank Class Inherits Account Class

{
	//Constructor Method
	public Bank_Of_Gordon(double bal, String fName, String lName, String str, String city, String st, String zip) {
		
		super(bal, fName, lName, str, city, st, zip);
		
	}

	public static void main(String[] args) 

	{

		String action;
		
		do 
		{
	
		//First Name 
		Scanner fname = new Scanner(System.in);
		System.out.println("What is Your First Name?"); //Prompt User For First Name
		String fnam = fname.nextLine();

		//Last Name
		Scanner lname = new Scanner(System.in);
		System.out.println("What is Your Last Name?"); //Prompt User For Last Name
		String lnam = lname.nextLine();

		//City
		Scanner city = new Scanner(System.in);
		System.out.println("What City Do You Live in?"); //Prompt User For City
		String ct = city.nextLine();

		//Street Address
		Scanner st = new Scanner(System.in);
		System.out.println("What is your Street Address"); //Prompt User For Street Address
		String street = st.nextLine();

		//Zip Code
		Scanner zip = new Scanner(System.in);
		System.out.println("What is Your Zip Code?"); //Prompt User For Zip Code
		String zp = zip.nextLine();

		//Prompt User to Check Personal / Business Account
		Scanner input = new Scanner(System.in);
		System.out.println("Would You Like To Check Your Personal (P) Or Business Account (B) Or Quit(Q)"); //Prompt User For Command
		System.out.println("Enter Choice: ");
		action = input.next();

		//Personal Account
		if (action.equalsIgnoreCase("P") || (action.equalsIgnoreCase("Personal"))) 
		{
		
		//Account Balance
		Scanner input1 = new Scanner(System.in);
		System.out.println("What is the Balance of your Personal Account?"); //Prompt User For Balance
		double balance = input1.nextDouble();

		Account pct = new Personal_Account(balance, fnam, lnam, null, ct, street, zp); //Assign Variables

		//Check Account IF They Meet the $100 Balance
		if (balance < 100) 
		{
			balance = balance - 2; 
			System.out.println("Balance is UNDER $100, $2 Fine is Charged to the Account");
		}
		
		System.out.println("Account Holder: " + fnam + " " +  lnam + "\nThe Balance of the Personal Account is: " + balance
				+ "\nThe Account Holder Lives in: \n" + ct + " " +  street + " " + zp); //Display Account Holder Information
		
		}
		
		//Check Business Account 
		if (action.equalsIgnoreCase("B") || (action.equalsIgnoreCase("Business"))) {

		//Account Balance
		Scanner input2 = new Scanner(System.in);
		System.out.println("What is the Balance of your Business Account?"); 
		double balance1 = input2.nextDouble();

		Account bct = new Business_Account(balance1, fnam, lnam, null, ct, street, zp); //Assign Variables
		
		//Check Account IF They Meet the $500 Balance
		if (balance1 < 500) 
		{
			
			balance1 = balance1 - 10; 
			System.out.println("Balance is UNDER $500, $10 Fine is Charged to the Account");
			
		}

		System.out.println("Account Holder: " + fnam + " " +  lnam + "\nThe Balance of the Business Account is: " + balance1 
				+ "\nThe Account Holder lives in: \n" + ct + " " +  street + " " + zp); //Display Account Holder Information
		
	}
		}

		//QUIT Option
		while (action.equalsIgnoreCase("Q") || (action.equalsIgnoreCase("Quit")));
		
		
	}
}

/*

Run #1: 

What is Your First Name?
d
What is Your Last Name?
d
What City Do You Live in?
Calgary
What is your Street Address
1234 Frost Street NE
What is Your Zip Code?
A1A 1A1
Would You Like To Check Your Personal (P) Or Business Account (B) Or Quit(Q)
Enter Choice: 
p
What is the Balance of your Personal Account?
105
Account Holder: d d
The Balance of the Personal Account is: 105.0
The Account Holder Lives in: 
Calgary 1234 Frost Street NE A1A 1A1

Run #2: 

What is Your First Name?
f
What is Your Last Name?
f
What City Do You Live in?
Calgary
What is your Street Address
1234 Frost Street NE
What is Your Zip Code?
A1A 1A1
Would You Like To Check Your Personal (P) Or Business Account (B) Or Quit(Q)
Enter Choice: 
b
What is the Balance of your Business Account?
499
Balance is UNDER $500, $10 Fine is Charged to the Account
Account Holder: f f
The Balance of the Business Account is: 489.0
The Account Holder lives in: 
Calgary 1234 Frost Street NE A1A 1A1

Run #3: 

What is Your First Name?
f
What is Your Last Name?
f
What City Do You Live in?
Calgary
What is your Street Address
1234 Frost Street NE
What is Your Zip Code?
A1A 1A1
Would You Like To Check Your Personal (P) Or Business Account (B) Or Quit(Q)
Enter Choice: 
q

*/