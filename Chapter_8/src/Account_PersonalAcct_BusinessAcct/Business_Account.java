/*

Program: Business_Account.java          Last Date of this Revision: March 16, 2022

Purpose: To be inherited by Bank of Gordon for the declared variables

Author: Zhuo Xi Hong, 
School: CHHS
Course: Computer Programming 30
 

*/


package Account_PersonalAcct_BusinessAcct;

public class Business_Account extends Account

{
	public Business_Account(double bal, String fName, String lName, String str, String city, String st, String zip) 
	
	{
	      super(bal, fName, lName, str, city, st, zip);
	
	      if (bal < 500) 
	
		{
	    	  bal = bal - 10;

	    	  System.out.println("A busines account requires a minimum balance of $500, a $10.0 fee has been charged for not meeting the requirements");
	    	  toString();
		
		}
	}
}
