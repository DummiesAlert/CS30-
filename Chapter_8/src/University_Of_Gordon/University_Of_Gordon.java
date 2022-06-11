/*
Program: University_Of_Gordon.java          Last Date of this Revision: June 9 2022

Purpose: Create a UEmployee class that contains member variables for the university employee 
		 name and salary. The UEmployee class should contain member methods for returning the 
		 employee name and salary. Create Faculty and Staff classes that inherit the UEmployee 
		 class. The Faculty class should include members for storing and returning the department 
		 name. The Staff class should include members for storing and returning the job title.

Author: Zhuo Xi Hong
School: CHHS
Course: Computer Programming 30
 
*/

package University_Of_Gordon;

import java.util.Scanner;

public class University_Of_Gordon 

{

	public static void main(String[] args) 
	{
		
		//Gets user Input from the User and Asks for First Name, Last Name, and Salary
		String action;
		do 
		{ 

		//First Name
		Scanner first = new Scanner(System.in);
		System.out.println("What is Your First Name?"); //Prompt For First Name
		String fn = first.nextLine();
		
		//Last Name
		Scanner last = new Scanner(System.in);
		System.out.println("What is Your Last Name?"); //Prompt For Last Name
		String ln = last.nextLine();
		
		//Salary
		Scanner sal = new Scanner(System.in);
		System.out.println("What is your Salary?"); //Prompt For Salary
		double s = sal.nextDouble();
		
		//Prompt the User if They're a Faulty or Staff Member or if they want to quit
		Scanner input = new Scanner(System.in);
		System.out.println("Are You a Faculty Member (F) \\ or a Staff Member (S) \\ Or Do you Want to Quit (Q)");
		System.out.println("Enter Choice: ");
		action = input.next();

		//If the user is apart of faculty ask them what department they work in
		if (action.equalsIgnoreCase("F") || (action.equalsIgnoreCase("Faculty"))) 
		
		{
		
		Scanner dept = new Scanner(System.in);
		System.out.println("What Department Do You Work in?"); 
		String d = dept.nextLine();
		
		Faculty emp1 = new Faculty(fn,ln,d,s); //Assign Variables fn,ln,d,s, with an Employee Number (emp1)
	
		System.out.println(emp1.toString()); //Display fn,ln,d,s to User
		
		}

		if (action.equalsIgnoreCase("S") || (action.equalsIgnoreCase("Staff")))  //If Statement For Staff
		
		{

		Scanner jobtitle = new Scanner(System.in);
		System.out.println("What is Your Job Title?"); //Prompt User For Job Title
		String jt = jobtitle.nextLine();

		Staff emp2 = new Staff(fn,ln,jt,s); //Assign Variables fn,ln,jt,s, with an Employee Number (emp2)
	
		System.out.println(emp2.toString()); //Display fn,ln,jt,s to User
		}
	}
		while (action.equalsIgnoreCase("Q") || (action.equalsIgnoreCase("Quit"))); //If User Chooses to QUIT

	}
}

/* Screen Dump:

Run #1: 

What is Your First Name?
f
What is Your Last Name?
d
What is your Salary?
34
Are You a Faculty Member (F) \ or a Staff Member (S) \ Or Do you Want to Quit (Q)
Enter Choice: 
f
What Department Do You Work in?
bob
University Employee Name: f a
Salary: 34.0
Faculty Department: bob

Run #2:

What is Your First Name?
f
What is Your Last Name?
d
What is your Salary?
34
Are You a Faculty Member (F) \ or a Staff Member (S) \ Or Do you Want to Quit (Q)
Enter Choice: 
s
What is Your Job Title?
cashier
University Employee Name: f d
Salary: 34.0
Staff Member Job Title: cashier

Run #3: 

What is Your First Name?
s
What is Your Last Name?
e
What is your Salary?
25
Are You a Faculty Member (F) \ or a Staff Member (S) \ Or Do you Want to Quit (Q)
Enter Choice: 
q

 */