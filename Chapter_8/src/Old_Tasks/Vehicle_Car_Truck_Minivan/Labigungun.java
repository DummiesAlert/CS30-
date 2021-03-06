/*

Program: Labigungun.java          Last Date of this Revision: March 22, 2022

Purpose: Declare Features of a Labigungun

Author: Zhuo Xi Hong, 
School: CHHS
Course: Computer Programming 30
 

*/

package Old_Tasks.Vehicle_Car_Truck_Minivan;



public class Labigungun extends Vehicle_2

{

	private double Doors;
	private String DoorsS;
	private String Car;


  public Labigungun(String c, String Fe, double FeI, String Cc, int CcI, String d, int Drs)


  {


   super(FeI, Cc, CcI);
   Doors = Drs;
   DoorsS = d;
   Car = c;

  }


  public double getDoors()

  {
	   return Doors;
  }


  public String getDoorsS()

  {

	   return DoorsS;

  }

  public String getCar()


  {

	   return Car;

  }

  public String toString()


  {

	   return "Car type: Sedan" + " Fuel economy: " + 8.9 + " Carrying Capacity: " + 5 + " Doors: " + 4;

  }

}


