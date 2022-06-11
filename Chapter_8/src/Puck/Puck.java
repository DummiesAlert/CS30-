/*
Program: University_Of_Gordon.java          Last Date of this Revision: June 9 2022

Purpose: Create a Puck class that inherits the Disk class. The Puck class should include member variables weight, 
		 standard, and youth. The standard and youth variables should be boolean variables that are set to either 
		 true or false depending on the weight of the puck. A standard puck weighs between 5 and 5.5 ounces. A youth 
		 puck weighs between 4 and 4.5 ounces. Official hockey pucks, regardless of weight, are one inch-thick with a 
		 three-inch diameter. The Puck class should also contain member methods getWeight(), getDivision(), which 
		 returns a string stating whether the puck is standard or youth, and equals() and toString(), which overrride 
		 the same methods in the Disk class. The Puck constructor should require an argument for weight. Be sure that 
		 the constructor initializes other variables to appropriate values as necessary. Create a Hockey application 
		 that tests the Puck class.

Author: Zhuo xi Hong
School: CHHS
Course: Computer Programming 30
 
*/

package Puck;

public class Puck

	{
		   private static double PI = 3.141592;
		   private double radius;
		   
		   public Puck()
		   {
		       radius = 1;//Set Radius to 1

		   }


		   public Puck(double r)

		   {
		       radius = r; //Set Radius to R
		       
		   }
		   public void setRadius(double newRadius)
		   {
		       radius = newRadius; //New Radius   
		       
		   }
		   public double area()
		   {
		       double circleArea;
		       circleArea = PI * radius * radius;//Formula for (circleArea)

		       return(circleArea);
		       
		   }
		   public double getRadius()
		   {
		       return(radius);
		       
		   }
		   public double circumference()
		   {
		       double circleCircumference;
		       circleCircumference = 2 * PI * radius; //Formula for (circleCircumference)
		       return(circleCircumference);
		       
		   }
		   public static void displayAreaFormula()
		   {
		   	
		       System.out.println("Area For A Circle Is: A= (PI)(r)^2"); //Display Area Formula of a Circle
		       
		   }
		   public boolean equals(Object c)
		    {
			   Puck testObj = (Puck)c;
		       if (testObj.getRadius() == radius) //Check Radius
		       {
		           return(true);
		           
		       }
		       else
		       { 
		           return (false);
		           
		       }
		    }
		    public String toString()
		    {
		        String circleString;
		        circleString = "The Circle has a Radius of " + radius;//Set Text
		        
		        return(circleString);
		        
		    }
	}