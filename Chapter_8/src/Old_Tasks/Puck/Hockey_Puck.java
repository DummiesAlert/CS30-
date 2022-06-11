/*

Program: Hockey_Puck.java          Last Date of this Revision: September 30, 2019

Purpose: Create a Puck class that inherits the Disk class. The Puck class should include member variables weight,
standard, and youth. The standard and youth variables should be boolean variables that are set to either true
or false depending on the weight of the puck. A standard puck weighs between 5 and 5.5 ounces. A youth
puck weighs between 4 and 4.5 ounces. Official hockey pucks, regardless of weight, are one inch-thick with a
three-inch diameter. The Puck class should also contain member methods getWeight(), getDivision(), which
returns a string stating whether the puck is standard or youth, and equals() and toString(), which overrride
the same methods in the Disk class. The Puck constructor should require an argument for weight. Be sure
that the constructor initializes other variables to appropriate values as necessary.
Create a Hockey application that tests the Puck class.

Author: Your Name, 
School: CHHS
Course: Computer Programming ??
 

*/

package Puck;

import java.util.Scanner;

public class Hockey_Puck 

{


		public static void main(String[] args)


		{

			Scanner input = new Scanner(System.in);
			
			Review_Puck_Part_2_of_2 pA = new Review_Puck_Part_2_of_2(5.5);
			Review_Puck_Part_2_of_2 yt = new Review_Puck_Part_2_of_2(4.0);

			//standard Review_Puck_Part_2_of_2

			System.out.println(pA.getWeight());
			System.out.println(pA.getDivision());
			System.out.println(pA.getRadius());
			
			//youth Review_Puck_Part_2_of_2

			System.out.println(yt.getWeight());
			System.out.println(yt.getDivision());
			System.out.println(yt.getRadius());

			String action;


			int w;
			double wArg;
			
			if(pA.equals(yt))

			{
				System.out.println("true");
			}


			else

			{
				System.out.println("false");
			}

		}
}

/* Screen Dump

5.5
puck is standard
1.0
4.0
puck is youth
1.0
false

 
 */
