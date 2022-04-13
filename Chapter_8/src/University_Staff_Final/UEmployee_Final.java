/*

Program: UEmployee_Final.java          Last Date of this Revision: March 16, 2022

Purpose: To Collect Variables from Employee, etc to prompt and display information for the user

Author: Zhuo Xi Hong, 
School: CHHS
Course: Computer Programming 30
 

*/


package University_Staff_Final;

public class UEmployee_Final 

{

	private String firstName, lastName;
	private Integer Salary; 
	
	//creating the basic information for an employee that will be later inherited by the staff and faculty classes)
	public UEmployee_Final(String Fn, String Ln, Integer Sal) {
		
		firstName = Fn;
		lastName = Ln; 
		Salary = Sal;
		
	}
	
	
	//returns a string representation of the object that contains the basic information for an employee 
	public String toString() {
		return (firstName + " " + lastName + " $" + Salary);
	
  }
	
}
