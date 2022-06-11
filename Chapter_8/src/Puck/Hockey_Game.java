package Puck;

	public class Hockey_Game
	{
		public static void main(String[] args)
		{
			Puck_2_Extends_Puck pA = new Puck_2_Extends_Puck(3.5);
			Puck_2_Extends_Puck yt = new Puck_2_Extends_Puck(2.0);

			System.out.println(pA.getWeight());//print out pAWeight
			System.out.println(pA.getDivision());//print out pADivision
			System.out.println(pA.getRadius());//print out pARadius

			System.out.println(yt.getWeight());//print out ytWeight
			System.out.println(yt.getDivision());//print out ytDivision
			System.out.println(yt.getRadius());//print out ytRadius

			if(pA.equals(yt))//check for equal
			{
				System.out.println("true");
				
			}
			else
			{
				System.out.println("false");
				
			}
		}
}
