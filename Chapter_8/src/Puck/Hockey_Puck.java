package Puck;

public class Hockey_Puck 

{

	import java.text.NumberFormat;




	import java.util.Scanner;


		public static void main(String[] args)


		{

			Scanner input = new Scanner(System.in);
			
			Review_Puck_Part_2_of_2 pA = new Review_Puck_Part_2_of_2(5.5);
			Review_Puck_Part_2_of_2 yt = new Review_Puck_Part_2_of_2(4.5);

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

