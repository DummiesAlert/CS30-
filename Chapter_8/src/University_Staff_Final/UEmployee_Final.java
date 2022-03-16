package University_Staff_Final;

public class UEmployee_Final 

{

	private String firstName, lastName;
	private Integer Salary; 
	
	//creating the basic information for an employee that will be later inherited by the staff and faculty classes)
	public UEmployee_Final(String Fn, String Ln, Integer Sal) {
		
		firstName = Fn;
		lastName = Ln; 
		Salary = Sal;
		
	}
	
	
	//returns a string representation of the object that contains the basic information for an employee 
	public String toString() {
		return (firstName + " " + lastName + " $" + Salary);
	
  }
	
}
