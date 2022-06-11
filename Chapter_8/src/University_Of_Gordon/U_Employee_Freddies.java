/*
Program: U_Employee_Freddies.java          Last Date of this Revision: June 9 2022

Purpose: Create Employee Details to be Inherited by University_Of_Gordon

Author: Zhuo xi Hong
School: CHHS
Course: Computer Programming 30
 
*/

package University_Of_Gordon;

public abstract class U_Employee_Freddies {

	//Initialize Private Variables
	private String firstName;
	private String lastName;
	private double salary;
	
//Constructor Method 
public U_Employee_Freddies(String fn, String ln, double s) //Assign Variables
{
	firstName = fn;
	lastName = ln;
	salary = s;
}

public String toString() //String Method to Return a Employee Information
{
	return("University Employee Name: " + firstName + " " + lastName + "\nSalary: " + salary);
}

}