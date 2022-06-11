/*
Program: Disk.java          Last Date of this Revision: June 9 2022

Purpose: Modify the Disk class to implement the Comparable interface. Two disks are 
		 equal when they have the same thickness and same radius. Modify the existing 
		 client code to test the new method.

Author: Zhuo Xi Hong
School: CHHS
Course: Computer Programming 30
 
*/

package Puck;

public class Disk extends Puck
{
	private double Thickness; //Double Variable
	
	   public Disk(double r, double t)
	   {
	   		super(r); 
	   		Thickness = t; //Assign Thickness as t
	   	
	   }
	   public void setThickness (double newThickness) //Double Variable
	   {
	   		Thickness = newThickness; //Assign Thickness as newThickness
	   	
	   }
	   public double getThickness()
	   {
	   		return(Thickness); //Return Thickness in Inherited Class to User
	   }
	  
	   public double volume()
	   {
		   double v; //Create Double V 
	   	
		   v = super.area();
		   return(v);
	   	
	   }
	  
	   public boolean equals(Object d)
	   {
		   Disk testObj = (Disk)d;
	   	
	   		if(testObj.getRadius() == super.getRadius() && testObj.getThickness() == Thickness)//Check for Thickness
	   		{
	   			return(true); //Return IF True to the User
	   			
	   		}
	   	
	   		else
	   		{
	   			return(false); //Return IF False to the User
	   			
	   		}
	   		
	   }
	   public String toString()
	   {
	   String diskString;
	   diskString = "The Disk Has A Radius Of: " + super.getRadius() + " And Thickness Of " + Thickness + "."; //Display Disk Details
	   return(diskString);
	   	
	   }
	   
}
