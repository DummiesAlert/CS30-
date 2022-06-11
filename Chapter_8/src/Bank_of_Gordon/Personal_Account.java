/*
Program: Personal_Account.java          Last Date of this Revision: June 9 2022

Purpose: Create Features for Personal Account to be Inherited by Bank_Of_Gordon

Author: Zhuo Xi Hong
School: CHHS
Course: Computer Programming 30
 
*/

package Bank_of_Gordon;

public class Personal_Account extends Account 

{
	//Constructor Method (Assign Variables)
	public Personal_Account(double bal, String fName, String lName, String str, String city, String st, String zip) {
		super(bal, fName, lName, str, city, st, zip);
	}
}