/*

Program: ????.java          Last Date of this Revision: September 30, 2019

Purpose: An application that uses nested for loops to output a table that diplays number in 
 multiples of ten.

Author: Your Name, 
School: CHHS
Course: Computer Programming ??
 

*/

package University_Staff_Tester;

public abstract class UEmployee_Abstract_With_Return_Instead_Of_System_out 

{

		private String firstName, lastName;
		private double salary;

		public UEmployee_Abstract_With_Return_Instead_Of_System_out(String fn, String ln, double sal)

		{

			firstName = fn;
			lastName = ln;
			salary = sal;
			
		}

		public String getFirstName()


		{

			return firstName;

		}

		public String getlastName()

		{

			return lastName;

		}

		public double getSalary()

		{

			return salary;

		}

		public void setfirstName(String fn)

		{

			firstName = fn;

		}

		public void setlastName(String ln)

		{

			lastName = ln;

		}

		public void setsalary(double sal)

		{

			salary = sal;

		}

		public String toString()

		{

			return("First Name: " + firstName + " Last Name: " + lastName + " Salary: " + salary);

		}
	}

/* Screen Dump

Paste the output of your code here
 
 */
