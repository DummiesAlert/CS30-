/*

Program: Personal_Account.java          Last Date of this Revision: March 16, 2022

Purpose: 

Author: Zhuo Xi Hong, 
School: CHHS
Course: Computer Programming 30
 

*/


package Account_PersonalAcct_BusinessAcct;

public class Personal_Account extends Account

{
	public Personal_Account(double bal, String fName, String lName, String str, String city, String st, String zip) 
	
	{		
	      super(bal, fName, lName, str, city, st, zip);
		
	      if (bal < 100) 
	
	      {
	    	  bal = bal - 2;
		
	    	  System.out.println("A personal account requires a minimum balance of $100, a $2 fee has been charged for not meeting the requirements");
	    	  toString();
	      }
	
	}
}
