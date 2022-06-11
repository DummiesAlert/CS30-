//Put BusinessAcct into Bank Package
package Bank_of_Gordon;



//BusinesslAcct Class inherits Account Class
public class Business_Account extends Account


{
	
	//constructor method
	public Business_Account(double bal, String fName, String lName, String str, String city, String st, String zip) 
	{
		super(bal, fName, lName, str, city, st, zip);
		
	}

}