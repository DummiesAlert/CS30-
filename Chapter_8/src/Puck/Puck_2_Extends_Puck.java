/*
Program: Puck_2_Extends_Puck.java          Last Date of this Revision: June 9 2022

Purpose: Create a Puck class that inherits the Disk class. The Puck class should include member variables 
		 weight, standard, and youth. The standard and youth variables should be boolean variables that are 
		 set to either true or false depending on the weight of the puck. A standard puck weighs between 5 
		 and 5.5 ounces. A youth puck weighs between 4 and 4.5 ounces. Official hockey pucks, regardless of 
		 weight, are one inch-thick with a three-inch diameter. The Puck class should also contain member 
		 methods getWeight(), getDivision(), which returns a string stating whether the puck is standard or 
		 youth, and equals() and toString(), which overrride the same methods in the Disk class. The Puck 
		 constructor should require an argument for weight. Be sure that the constructor initializes other 
		 variables to appropriate values as necessary. Create a Hockey application that tests the Puck class.


Author: Zhuo Xi Hong
School: CHHS
Course: Computer Programming 30
 
*/

package Puck;

public class Puck_2_Extends_Puck extends Puck

{
		//Assign Variables 
		double AdMax = 5.5;
		double AdMin = 5;
		double YthMax = 4.5;
		double YthMin = 4;
		double weight;
		boolean standard, youth;

		public Puck_2_Extends_Puck(double w) 
		{
			weight = w; //Assign Variable weight as w

			if(weight >= AdMin && weight <= AdMax) //Determines IF Weight is Larger Than AdMin and is Lower Than AdMax
			{
				standard = true;
				youth = false;
				
			}
			else if(weight >= YthMin && weight <= YthMax) //Determines IF Weight is Larger Than YthMin and is Lower Than YthMax
			{
				standard = false;
				youth = true;
				
			}
		}
		public String getDivision()
		{
		  String div; //Create div 
		  
		  if(standard) //IF matches the Data Above, Display Standard
		  {
			  div = "puck is standard";
			  
		  }
		  else //Else The Puck is Youth
		  {
			  div = "puck is youth";
			  
		  }
		  		return div; //Return div
		  	
		  }
		
		 public double getWeight() //Get Weight From Class With it
		 {
			 return(weight);
		  
		 }
	    public boolean equals(Object p) //IF Matches Object p, Then Determine Validity of Weight and Return it
	    {
	    	Puck_2_Extends_Puck testObj = (Puck_2_Extends_Puck)p;

	    	if(testObj.getWeight() == weight)
	    	{
	    		return(true);
			  
	    	}
	    	
	    	else
	    	{
				return false;
				  
	    	}
	    }	
}  