/*

Program: ????.java          Last Date of this Revision: September 30, 2019

Purpose: An application that uses nested for loops to output a table that diplays number in 
 multiples of ten.

Author: Your Name, 
School: CHHS
Course: Computer Programming ??
 

*/

package University_Staff;

import java.util.Scanner;

public class Uni_Releaser {

	public static UEmployee_One assign() 
	
	{ 

		try (Scanner input = new Scanner(System.in)) {
			System.out.println("");
			System.out.println("Enter employees first name");
			String Fn = input.next();

			System.out.println("Enter employees last name");
			String Ln = input.next();

			System.out.println("Enter employees salary");
			int Sal = input.nextInt();

			System.out.println("Enter employee type: Faculty or Staff");
			String EmpType;
			EmpType = input.next();

			
			if(EmpType.equalsIgnoreCase("Faculty")) 
			
			{
				System.out.println("Enter Department name:");
				String D = input.next();

				return new Faculty(Fn, Ln, Sal, D);
			}


			else

			{

				System.out.println("Enter job title");
				String Job = input.next();

				return new Staff(Fn, Ln, Sal, Job);

 }
		}

}	

		//adding main class and employees
		public static void main(String[] args) {

			UEmployee_One emp1, emp2, emp3;


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