/*

Program: Faculty_Final.java          Last Date of this Revision: March 16, 2022

Purpose: To declare variables for faculty staff

Author: Zhuo Xi Hong, 
School: CHHS
Course: Computer Programming 30
 

*/


package Old_Tasks.University_Staff_Final;

public class Faculty_Final extends UEmployee_Final

{

		//initializing string used to store department, which is faculty specific 
		private String Deptname;
		
		
		public Faculty_Final(String Fn, String Ln, Integer Sal, String D) {
			super(Fn, Ln, Sal);
		
			Deptname = D;
		}
		
		//when the faculty class is called it will return the department name 
		public String toString() 
		
		{
			
			return(super.toString() + " " + Deptname);
			
		}	
	}
	
