package Puck;

public class Puck

	{
		   private static double PI = 3.141592;
		   private double radius;
		   
		   public Puck()
		   {
		       radius = 1;//set radius to 1

		   }


		   public Puck(double r)

		   {
		       radius = r;//set radius to r
		       
		   }
		   public void setRadius(double newRadius)
		   {
		       radius = newRadius;//new radius   
		       
		   }
		   public double area()
		   {
		       double circleArea;
		       circleArea = PI * radius * radius;//formula for circleArea

		       return(circleArea);
		       
		   }
		   public double getRadius()
		   {
		       return(radius);
		       
		   }
		   public double circumference()
		   {
		       double circleCircumference;
		       circleCircumference = 2 * PI * radius;//formula for circleCircumference
		       return(circleCircumference);
		       
		   }
		   public static void displayAreaFormula()
		   {
		   	
		       System.out.println("Area For A Circle Is: A= (PI)(r)^2");
		       
		   }
		   public boolean equals(Object c)
		    {
			   Puck testObj = (Puck)c;
		       if (testObj.getRadius() == radius)//check radius
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
		        circleString = "The Circle has a Radius of " + radius;//set text
		        
		        return(circleString);
		        
		    }
	}