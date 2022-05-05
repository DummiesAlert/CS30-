package Tasks;

/*

Program: Student_Name.java          Last Date of this Revision: May 5, 2022

Purpose: Declares firstName and lastName strings and return these values when extended to Review_Roster

Author: Zhuo Xi Hong, 
School: CHHS
Course: Computer Programming 30
 

*/


import java.io.Serializable;


	public class Student_Name implements Serializable


	{
		private String firstName;
		private String lastName;
		public Student_Name(String fn, String ln)
		
		{

			firstName = fn;
			lastName = ln;

		}

		public String toString()

		{
			return(firstName + " " + lastName);
		}
	}
