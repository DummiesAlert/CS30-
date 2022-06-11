package Puck;

public class Puck_Program extends Puck

{
		double AdMax = 5.5;
		double AdMin = 5;
		double YthMax = 4.5;
		double YthMin = 4;
		double weight;
		boolean standard, youth;

		public Puck_Program(double w)
		{
			weight = w;

			if(weight >= AdMin && weight <= AdMax)
			{
				standard = true;
				youth = false;
				
			}
			else if(weight >= YthMin && weight <= YthMax)
			{
				standard = false;
				youth = true;
				
			}
		}
		public String getDivision()
		{
		  String div;
		  
		  if(standard)
		  {
			  div = "puck is standard";
			  
		  }
		  else
		  {
			  div = "puck is youth";
			  
		  }
		  		return div;
		  	
		  }
		
		 public double getWeight()
		 {
			 return(weight);
		  
		 }
	    public boolean equals(Object p)
	    {
	    	Puck_Program testObj = (Puck_Program)p;

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
