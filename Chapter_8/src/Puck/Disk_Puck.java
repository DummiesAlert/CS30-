package Puck;

public class Disk_Puck extends Circle_Puck

{

	private double Thickness;
	
	   public Disk_Puck(double r, double t)
	   
	   {
	   	super(r);
	   	Thickness = t;
	   }
		
	   public void setThickness (double newThickness)
	   
	   {
	   	Thickness = newThickness;
	   }
	  
	   public double getThickness()
	   
	   {
	   	return(Thickness);
	   }
	  
	   public double volume()
	   
	   {
	   	
	   	double v;
	   	
	   	v = super.area();
	   			return(v);
	   	
	   }
	  
	   public boolean equals(Object d)
	   
	   {
	   	
		   Disk_Puck testObj = (Disk_Puck)d;
	   	
	   	if(testObj.getRadius() == super.getRadius() && testObj.getThickness() == Thickness)
	   		
	   	{
	   		return(true);
	   	}
	   	
	   	else
	   		
	   	{
	   		return(false);
	   	}
	   	
	   }
	  
	   public String toString()
	   
	   {
	   	
	   	String diskString;
	   	diskString = "The Disk Has A Radius Of: " + super.getRadius() + " And Thickness Of " + Thickness + ".";
	   	return(diskString);
	   	
	   }
	  


	
}
