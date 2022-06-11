//Put Staff into University Package
package University_Of_Gordon;



//Staff class inherits UEmployee class
public class Staff extends U_Employee_Freddies
{
	
	//initialize job title variable
	private String jobtitle;

	
	//constructor method
	public Staff(String fn, String ln, String j, double s) 
	{
		super(fn, ln,s);
		jobtitle = j;

	}
	
	
	//String method to return job title
	String getJobTitle() 
	{
		return jobtitle;
	}
	

	//String Method to return Staff job title
	public String toString()
	{
		return(super.toString() + "\nStaff Member Job Title: " + getJobTitle());
	}

}