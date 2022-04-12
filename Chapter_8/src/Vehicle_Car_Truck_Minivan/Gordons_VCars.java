package Vehicle_Car_Truck_Minivan;

import java.util.Scanner;

public class Gordons_VCars 

{

	public static void main(String[] args)
	{
		
		Labigungun vel1 = new Labigungun("Car", "Fuel Economy: ", 8.9, "Carrying Capacity: ", 5, "doors: ", 4);
		Truck vel2 = new Truck("Truck", "Fuel Economy: ", 2.1, "Horse Power: ", 341, "Carrying Capacity: ", 3);
		Minivan vel3 = new Minivan("Minivan", "Fuel Economy: ", 9.3, "Carrying Capacity: ", 7, "Seatcap: ", 7);
		
		try (Scanner input = new Scanner(System.in)) {
			String action;
			int velNum = 0;
			
			do
			{
				
				System.out.println("\n Vehicles \\ Quit");
				System.out.println("Enter Choice: ");
				action = input.next();
				
				if(!action.equalsIgnoreCase("Q"));
				{
					
					System.out.println("Choose a vehicle(1. Labigungun, 2. Truck, 3. Minivan): ");
					velNum = input.nextInt();
					
					switch(velNum)
					{
					
					case 1: System.out.println(vel1); break;
					case 2: System.out.println(vel2); break;
					case 3: System.out.println(vel3); break;
						
					}
					
					
					
				}
				
			}while(!action.equalsIgnoreCase("Q"));
		}
		
	}


	
}
