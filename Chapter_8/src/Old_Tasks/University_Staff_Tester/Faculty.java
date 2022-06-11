/*

Program: Faculty.java          Last Date of this Revision: March 16, 2022

Purpose: 

Author: Zhuo Xi Hong, 
School: CHHS
Course: Computer Programming 30
 

*/

package University_Staff_Tester;

public class Faculty extends UEmployee_One 

{

	private String Deptname;

	public Faculty(String Fn, String Ln, Integer Sal, String D) 
	
	{

		super(Fn, Ln, Sal);
		Deptname = D;
		
	}

	public String toString() 
	
	{

		return(super.toString() + " " + Deptname);
		
	}	
}

/* Screen Dump

Paste the output of your code here
 
 */
