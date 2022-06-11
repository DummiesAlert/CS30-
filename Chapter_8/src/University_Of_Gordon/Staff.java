/*
Program: Staff.java          Last Date of this Revision: June 9 2022

Purpose: Create Varibles For Variables for Staff to be Inherited by University_Of_Gordon

Author: Zhuo xi Hong
School: CHHS
Course: Computer Programming 30
 
*/

package University_Of_Gordon;

public class Staff extends U_Employee_Freddies
{

	private String jobtitle;

	//Constructor Method
	public Staff(String fn, String ln, String j, double s) 
	{
		super(fn, ln,s);
		jobtitle = j;

	}
	
	String getJobTitle() //String Method to Return Job Title
	{
		return jobtitle;
	}
	
	public String toString() //String Method to Return Staff Job Title
	{
		return(super.toString() + "\nStaff Member Job Title: " + getJobTitle());
	}

}