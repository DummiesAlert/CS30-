/*
Program: Trucc_Kun.java          Last Date of this Revision: June 9 2022

Purpose: Create Features of Trucc_Kun to be Inherited by Gordon_Vcars

Author: Zhuo Xi Hong
School: CHHS
Course: Computer Programming 30
 
*/

package Gordon_Vcars;

public class Trucc_Kun extends Vehicle
{

	//Constructor Method
	public Trucc_Kun(int fECity, int fEHwy, int seating, double cargo) 
	{
		super(fECity, fEHwy, seating, cargo);
		
	}
	
	String cargoContainer() //String method to Return Cargo Volume
	{
		return("\nCargo Volume of the Car is: "+ super.getCargoVolume() + " Cubic Feet");
	}

	String description() { //String Method to Return Description of the Vehicle
		return("\n N/A");
	}
	
	
	String Seating() //String Method to Return the Seating of the Vehicle
	{
		return("\nThe Vehicle has " + super.getSeating() + " Seats ");
	}
	
	String FECity() //String Method to Return the Fuel Economy of the Vehicle in the City
	{
		return("Fuel Economy in the City is: " + super.getFECity() + " Miles Per Gallon");
	}
	
	
	String FEHwy() //String Method to Return the Fuel Economy of the Vehicle on the Highway
	{
		return("\nFuel Economy on the Highway is: " + super.getFEHwy() + " Miles Per Gallon");
	}
	
	public String toString() //toString Method to return Fuel Economy, Seating, Cargo, and Description of Vehicle
	{
		return(FECity() + FEHwy() + Seating() + cargoContainer() + description());

	}
}