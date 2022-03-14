/*

Program: ????.java          Last Date of this Revision: September 30, 2019

Purpose:

Author: Your Name, 
School: CHHS
Course: Computer Programming ??
 

*/

package Puck;

import java.text.NumberFormat;
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

Paste the output of your code here
 
 */
