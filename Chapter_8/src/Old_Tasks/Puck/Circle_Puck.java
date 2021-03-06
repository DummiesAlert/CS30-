/*

Program: Circle_Puck.java          Last Date of this Revision: April 3, 2022

Purpose: Declare Variables and be inherited by Puck

Author: Zhuo Xi Hong, 
School: CHHS
Course: Computer Programming 30
 

*/

package Old_Tasks.Puck;

public class Circle_Puck

	{
		    private static double PI = 3.141592;
		    private double radius;


		   public Circle_Puck()


		    {

		        radius = 1;//radius equals 1

		    }


		    public Circle_Puck( double r)


		    {
		    	
		        radius = r;// radius equals r
		        
		    }

		    
		    public void setRadius(double newRadius)


		    {
		    	
		        radius = newRadius;// get new radius
		        
		    }

		    public double area()


		    {
		        double circleArea;
		        circleArea = PI * radius * radius;// PI times radius times radius

		        return(circleArea);
		    }

		    public double getRadius()
		    
		    {
		    	
		        return(radius);
		        
		    }

		    public double circumference()

		    {
		    	
		        double circleCircumference;
		        circleCircumference = 2 * PI * radius;// two times PI times radius

		        return(circleCircumference);

		    }

		    public static void displayAreaFormula()


		    {
		    	
		        System.out.println("Area For A Circle Is: A= πr^2");
		        
		    }


		    public boolean equals(Object c)


		    {

		    	Circle_Puck testObj = (Circle_Puck)c;


		          if (testObj.getRadius() == radius)

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
		        circleString = "The Circle has a Radius of " + radius;
		        
		        return(circleString);
		    }

	}

/* Screen Dump

Paste the output of your code here
 
 */