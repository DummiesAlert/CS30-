/*
Program: Faculty.java          Last Date of this Revision: June 9 2022

Purpose: Create Variables to be Inherited by University_Of_Gordon

Author: Zhuo Xi Hong
School: CHHS
Course: Computer Programming 30
 
*/

package University_Of_Gordon;

public class Faculty extends U_Employee_Freddies {
	
	private String dept;

	//Constructor Method
	public Faculty(String fn, String ln, String d, double s) 
	{
		super(fn, ln,s);
		dept = d;
	}
	
	String getDept() //String Method to Return Department
	{
		return dept;
	}
	
	public String toString() //String Method to Return Faculty Department
	{
	return(super.toString()+ "\nFaculty Department: " + getDept());
	}
		
}