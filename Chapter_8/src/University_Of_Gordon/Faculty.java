//Put Faculty into package called University
package University_Of_Gordon;


//Faculty class inherits UEmployee class
public class Faculty extends U_Employee_Freddies {
	
	
	
	//initialize department variable
	private String dept;

	
	//constructor method
	public Faculty(String fn, String ln, String d, double s) 
	{
		super(fn, ln,s);
		dept = d;
	}
	
	
	//String method to return department
	String getDept() 
	{
		return dept;
	}
	
	
	//String Method to return Faculty Department
	public String toString()
	{
	return(super.toString()+ "\nFaculty Department: " + getDept());
	}
	
	
}