package Old_Tasks.Vehicle_Car_Truck_Minivan;

/*

Program: Vehicle_2.java          Last Date of this Revision: April 13, 2022

Purpose: To declare variables and features inside a vehicle

Author: Zhuo Xi Hong, 
School: CHHS
Course: Computer Programming 30
 

*/

public abstract class Vehicle_2 //Declare Variables for Features of the Vehicle

{

	private double Feconomy; 
	private double carryCapacity;
	
	public Vehicle_2(double FeI, String Cc, double CcI)
	{
		
		Feconomy = FeI;
		carryCapacity = CcI;
		
	}
	
	//Return Values to Get in another class
	
	public double getFeconomy()
	{
		return Feconomy;
	}
	
	public double getCarryCapacity()
	{
		return carryCapacity;
	}
	
	public String toString()
	{
		return("Fuel Economy: " +
	           "Carrying Capacity: ");
	}
	
}

