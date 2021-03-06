/*

Program: Staff_Final.java          Last Date of this Revision: March 16, 2022

Purpose: Declare Variables For Staff

Author: Zhuo Xi Hong, 
School: CHHS
Course: Computer Programming 30
 

*/


package Old_Tasks.University_Staff_Final;

public class Staff_Final extends UEmployee_Final

{

		//initializing string used to store the job title, which is staff specific 
		private String jobTitle; 

			public Staff_Final(String Fn, String Ln, int Sal, String Job) {
				super(Fn, Ln, Sal);
				
				jobTitle = Job;		
			}

			//when the staff class is called it will return the job title 
			public String toString() {
				return(super.toString() + " " + jobTitle);

				
	  }
	
}
