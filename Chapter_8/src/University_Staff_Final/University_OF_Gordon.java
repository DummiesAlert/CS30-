/*

Program: University_OF_Gordon.java          Last Date of this Revision: March 16, 2022

Purpose: 

Author: Zhuo Xi Hong, 
School: CHHS
Course: Computer Programming 30
 

*/


package University_Staff_Final;

import java.util.Scanner;

public class University_OF_Gordon

{

public static UEmployee_Final assign() {
		
		//creating a new scanner to receive inputs 
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
	
		//asking the set of questions on name, age, salary and faculty and assigning the answers to variables 
		System.out.println("Welcome to University of Gordon Employee Page, Please Enter the Following Details:");
		
		System.out.println("Enter Here, Employees First Name:");
		String Fn = input.next();
		
		System.out.println("Enter Here, Employees Last Name:");
		String Ln = input.next();
		
		System.out.println("Enter Here, Employees Salary:");
		int Sal = input.nextInt();
		
		System.out.println("Enter Here, Employee Type: Faculty or Staff:");
		//creates a string to store how the user responds to the question
		String EmpType;
		EmpType = input.next();
	
		
	/* 
		  decision making statement depending on whether the previously entered string states that the employee is a faculty member, 
		  equalsIgnoreCase means the comparison to the inputed string ignores case considerations 				*/ 
		
		if(EmpType.equalsIgnoreCase("Faculty")) 
		
		{
			
			System.out.println("Enter Here, Department Name:");
			//D string is set up so that it can input and display two word answers for department, Ex. (computer science)
			String D = input.next(); 
			       D+= input.nextLine();
			   		  
			//return specific to faculty that displays all of the variables that have been inputed, including department
		    return new Faculty_Final(Fn, Ln, Sal, D);
			
		}
		
		else
			
		{
			
			System.out.println("Enter Here, Job Title/Position:");
			//Job string has also been set up to take multiple word answers
			String Job = input.next();
			       Job+= input.nextLine();
			      	     
			//return specific to staff that displays all of the variables that have been inputed, including job title/position
			return new Staff_Final(Fn, Ln, Sal, Job);
					
		} 

		
	
	}	

		
		//adding main class and employees 
		public static void main(String[] args) {
	
			//creates variable for each of the three employees that will be inputed and displayed
			UEmployee_Final emp1, emp2, emp3;
			
	   /* 	assigns the traits from the public class UEmployee to each employee variable (emp1, emp2, emp3) so that
		    each employee being inputed gets its own set of questions asked and integers assigned to it 		*/	 
			emp1 = assign();
			emp2 = assign();
			emp3 = assign();

			
			//after all three employees have had variables assigned to them the variables are displayed back to the user
			System.out.println("\nThree University Employees:");
			System.out.println(emp1);
			System.out.println(emp2);
			System.out.println(emp3);
		
  }	
	
}

/* Screen Dump

Run #1:

Welcome to University of Gordon Employee Page, Please Enter the Following Details:
Enter Here, Employees First Name
d
Enter Here, Employees Last Name
d
Enter Here, Employees Salary
4534
EEnter Here, Employee Type: Faculty or Staff
Staff
Enter Here, Job Title/Position:
Cahier
Welcome to University of Gordon Employee Page, Please Enter the Following Details:
Enter Here, Employees First Name
d
Enter Here, Employees Last Name
d
Enter Here, Employees Salary
435
EEnter Here, Employee Type: Faculty or Staff
Faculty
Enter Here, Department Name:
d

Run #2:

Welcome to University of Gordon Employee Page, Please Enter the Following Details:
Enter Here, Employees First Name:
John
Enter Here, Employees Last Name:
Baker
Enter Here, Employees Salary:
32413
Enter Here, Employee Type: Faculty or Staff:
Staff
Enter Here, Job Title/Position:
Cashier
Welcome to University of Gordon Employee Page, Please Enter the Following Details:
Enter Here, Employees First Name:

Kohn
Enter Here, Employees Last Name:
Caker
Enter Here, Employees Salary:
52345
Enter Here, Employee Type: Faculty or Staff:
Faculty
Enter Here, Department Name:
Cashier
Welcome to University of Gordon Employee Page, Please Enter the Following Details:
Enter Here, Employees First Name:
Lohn
Enter Here, Employees Last Name:
Daker
Enter Here, Employees Salary:
23452
Enter Here, Employee Type: Faculty or Staff:
Staff
Enter Here, Job Title/Position:
Cashier

Three University Employees:
John Baker $32413 Cashier
Kohn Caker $52345 Cashier
Lohn Daker $23452 Cashier
 */


