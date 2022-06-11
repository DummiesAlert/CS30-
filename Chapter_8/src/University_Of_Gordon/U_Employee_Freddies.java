//Put UEmployee into University Package
package University_Of_Gordon;


//Create abstract class called UEmployee
public abstract class U_Employee_Freddies {

	
	
	//initialize variables
	private String firstName;
	private String lastName;
	private double salary;
	

//constructor method 
public U_Employee_Freddies(String fn, String ln, double s)
{
	firstName = fn;
	lastName = ln;
	salary = s;
}


//String Method to return a string that has first name last name and salary, it prints UEmployee Object
public String toString()
{
	return("University Employee Name: " + firstName + " " + lastName + "\nSalary: " + salary);
}



}