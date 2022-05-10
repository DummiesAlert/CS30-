package Tasks;

	import java.util.Scanner;

	public class Review_HighestGrade {


		public static void main(String[] args)

		{

			double scoreValue = 0;
			double lowScore = 100;
			double highScore = 0;

			int num = 0;

			int[] grade = new int[5];

			Scanner input = new Scanner(System.in);

			// calculates the square

		    for(int i = 0; i < grade.length;i ++)

		    {
				  	    System.out.println("Enter a grade between 0 and 100: "); 	  
				  	    num = input.nextInt();
				  	    grade[i] = num;

		    }

		    //displays the array
		    
		    for(int i = 0; i < grade.length;i ++)

		    {

				   if(num > highScore)

				     {

					     highScore = num;

				     }

		    }

		    	System.out.println("Highest Score: " + highScore);
	}

}
