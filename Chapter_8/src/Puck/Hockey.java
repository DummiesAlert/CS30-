package Puck;

	public class Hockey
	{
		public static void main(String[] args)
		{
			Puck_Program pA = new Puck_Program(3.5);
			Puck_Program yt = new Puck_Program(2.0);

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
