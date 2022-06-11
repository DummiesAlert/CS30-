/*

Program: Minivan.java          Last Date of this Revision: April 6, 2022

Purpose: Declare Features of a Minivan

Author: Zhuo Xi Hong, 
School: CHHS
Course: Computer Programming 30
 

*/

package Vehicle_Car_Truck_Minivan;

public class Minivan extends Vehicle_2


{

	private String seatCapS;
	private double seatCap;
	private String Minivan;

	public Minivan(String M, String Fe, double FeI, String Cc, int CcI, String Sc, int ScI)


	{

		super(FeI, Cc, CcI);
		seatCapS = Sc;
		seatCap = ScI;
		Minivan = M;

	}

	public Double getSeatCap()


	{

		return seatCap;

	}

	public String getSeatCapS()


	{

		return seatCapS;

	}


	public String getMinivan()


	{

		return Minivan;

	}

	   public String toString()


	   {

		   return "Car type: Minivan" + " Fuel economy: " + 9.3 + " Carrying Capacity: " + 7 + " Seatcap: " + 7;

	   }

}


