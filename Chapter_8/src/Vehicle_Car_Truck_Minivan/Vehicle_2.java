package Vehicle_Car_Truck_Minivan;

public abstract class Vehicle_2 

{

	private double Feconomy;
	private double carryCapacity;
	
	public Vehicle_2(double FeI, String Cc, double CcI)
	{
		
		Feconomy = FeI;
		carryCapacity = CcI;
		
	}
	
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

