/*

Program: Uni_Releaser.java          Last Date of this Revision: March 15, 2022

Purpose: 

Author: Zhuo Xi Hong, 
School: CHHS
Course: Computer Programming 30
 

*/

package University_Staff_Tester;

import java.util.Scanner;

public class Uni_Releaser {

	public static Uni_Releaser assign() 
	
	{ 
		//Prompt A User With Employee Information.
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("");
			System.out.println("Enter Employees First Name");
			String Fn = input.next();

			System.out.println("Enter Employees Last Name");
			String Ln = input.next();

			System.out.println("Enter Employees Salary");
			int Sal = input.nextInt();

			System.out.println("Enter Employee Type: Faculty or Staff");
			String EmpType;
			EmpType = input.next();

			
			if(EmpType.equalsIgnoreCase("Faculty")) 
			
			{
				//Prompt User For Department Name If They Are in Faculty
				System.out.println("Enter Department Name:");
				String D = input.next();

				return new Faculty(Fn, Ln, Sal, D);
			}


			else

			{
				//If Not Faculty, Then Prompt For Employee Job Title
				System.out.println("Enter Job Title");
				String Job = input.next();

				return new Staff(Fn, Ln, Sal, Job);

 }
		}

}	

		//Adding Main Class and Employees. Also Declares the Employee Number For Future Reference
		public static void main(String[] args) {

			Uni_Releaser emp1, emp2, emp3;


			emp1 = assign();
			emp2 = assign();
			emp3 = assign();

			System.out.println("University Employees:");
			System.out.println(emp1);
			System.out.println(emp2);
			System.out.println(emp3);

 }	

}

/* Screen Dump

Paste the output of your code here
 
 */