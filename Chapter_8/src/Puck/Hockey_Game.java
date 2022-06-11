/*
Program: Hockey_Game.java          Last Date of this Revision: June 9 2022

Purpose: Create a Puck class that inherits the Disk class. The Puck class should include member variables weight, 
		 standard, and youth. The standard and youth variables should be boolean variables that are set to either 
		 true or false depending on the weight of the puck. A standard puck weighs between 5 and 5.5 ounces. A youth 
		 puck weighs between 4 and 4.5 ounces. Official hockey pucks, regardless of weight, are one inch-thick with a 
		 three-inch diameter. The Puck class should also contain member methods getWeight(), getDivision(), which 
		 returns a string stating whether the puck is standard or youth, and equals() and toString(), which overrride 
		 the same methods in the Disk class. The Puck constructor should require an argument for weight. Be sure that 
		 the constructor initializes other variables to appropriate values as necessary. Create a Hockey application 
		 that tests the Puck class.

Author: Zhuo Xi Hong
School: CHHS
Course: Computer Programming 30
 
*/

package Puck;

	public class Hockey_Game
	{
		public static void main(String[] args)
		{
			Puck_2_Extends_Puck pA = new Puck_2_Extends_Puck(3.5);
			Puck_2_Extends_Puck yt = new Puck_2_Extends_Puck(2.0);

			System.out.println(pA.getWeight());//Display pAWeight to User
			System.out.println(pA.getDivision());//Display pADivision to User
			System.out.println(pA.getRadius());//Display pARadius to User

			System.out.println(yt.getWeight());//Display ytWeight to User
			System.out.println(yt.getDivision());//Display ytDivision to User
			System.out.println(yt.getRadius());//Display ytRadius to User

			if(pA.equals(yt))//Check if PAWeight is Equal to ytWeight
			{
				System.out.println("true");
				
			}
			else
			{
				System.out.println("false");
				
			}
		}
}

/*
	
Run: 

3.5
puck is youth
1.0
2.0
puck is youth
1.0
false

	
*/