package Tasks;

/*

Program: Student_Name.java          Last Date of this Revision: May 5, 2022

Purpose: Declares firstName and lastName strings and return these values when extended to Review_Roster

Author: Zhuo Xi Hong, 
School: CHHS
Course: Computer Programming 30
 

*/


import java.io.Serializable;


	public class Student_Name implements Serializable //Keeps data in file serialized, corrupted to hide data. 

	/*

		This makes a String firstName and lastName and declare it as fn and ln in order to be used in 
		the mother class Roster and uses this class to return the fn and ln values. 

	*/
	
	{
		private String firstName; //Private String Designated in This File
		private String lastName; //Private String Designated in This File
		
		public Student_Name(String fn, String ln) //Declare String to be Inherited
		
		{

			firstName = fn; 
			lastName = ln;

		}

		public String toString() //Return fn and ln in This Class and Inheriter

		{
			return(firstName + " " + lastName);
		}
	}
