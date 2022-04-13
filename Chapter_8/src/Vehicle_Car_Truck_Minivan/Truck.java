/*

Program: Truck.java          Last Date of this Revision: April 3, 2022

Purpose: Features of a Truck

Author: Zhuo Xi Hong, 
School: CHHS
Course: Computer Programming 30
 

*/

package Vehicle_Car_Truck_Minivan;

public class Truck extends Vehicle_2

{


	private double horsePower;
	private String Truck;
	private String horsePowerS;

	   public Truck(String t, String Fe, double FeI, String Hp, int HpI, String Cc, int CcI)
	   {

	   super(FeI, Cc, CcI);
	   horsePower = HpI;
	   horsePowerS = Hp;
	   Truck = t;
	   
	   }

	   public Double getHorsePower()

	   {

		   return horsePower;
	   }


	   public String getHorsePowerS()


	   {

		   return horsePowerS;

	   }


	   public String getTruck()


	   {

		   return Truck;

	   }


	   public String toString()


	   {

		   return "Car type: truck" + " Fuel economy: " + 2.1 + " Horse Power: " + 341 + " Carrying Capacity: " + 3;

	   }

}

