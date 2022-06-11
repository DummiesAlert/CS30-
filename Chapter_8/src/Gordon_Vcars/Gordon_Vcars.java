//Put MyDealership into CarDealership Package
package Gordon_Vcars;




import java.util.Scanner;



//Create a class called MyDealership
public class Gordon_Vcars 
{
	
	
	
	//Main Method
	public static void main(String[] args)
	{
		
		
		
		//Gets user Input from the user and asks if they would like to check
		//Car, Truck, Minivan, or if they would like to quit
		String action;
		do 
		{
			
			
			
			try (//asks if they want to check Car, Truck, Minivan, or quit
			Scanner input = new Scanner(System.in)) {
				System.out.println("Would You Like To Check Car (C) Or Truck (T) Or Minivan (M) Or Quit(Q)");
				System.out.println("Enter Choice: ");
				action = input.next();
			}
			//If the user wants to check Car
			if (action.equalsIgnoreCase("C") || (action.equalsIgnoreCase("Car"))) 
			{
				
				
				//Assign variable c to new Car class with Fuel economy, seating 
				//and cargo volume
				Labigungun c = new Labigungun (28,36,5,60);
				
				
				//Print out c
				System.out.println(c.toString());
				
			}
			
			
			
			//if the user wants to check Truck
			if (action.equalsIgnoreCase("T") || (action.equalsIgnoreCase("Truck"))) 
			{
				
				
				//Assign variable t to new Truck class with Fuel economy, seating 
				//and cargo volume
				Trucc_Kun t = new Trucc_Kun(14,18,5,89);
				
				
				//Print out t
				System.out.println(t.toString());
				
				
			}
			
			
			
			
			//If the user wants to check Minivan
			if (action.equalsIgnoreCase("M") || (action.equalsIgnoreCase("Minivan"))) 
			{
				
				
				//Assign variable m to new Minivan class with Fuel economy, seating 
				//and cargo volume
				Minibun m = new Minibun(30,35,8,140);
				
				
				//Print out m
				System.out.println(m.toString());
				
				
			
		}
		}
		
		//if the user chooses to quit then exit the program
		while (action.equalsIgnoreCase("Q") || (action.equalsIgnoreCase("Quit")));
		
}
}
