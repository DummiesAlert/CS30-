package Tasks;

import java.util.Scanner;
	
	public class Review_FindName {

		public static void main(String[] args)

		{

		   Scanner input = new Scanner(System.in);
		   String name = null;
		   int location;
		   String[] nameCount = new String[5];

		   //asks the users for names

	      for(int i = 0; i < nameCount.length;i ++)

	      {

	   	   System.out.println("Please Enter A Name: ");
	   	   nameCount[i] = input.next();
	      }

		   //asks the users for a name to search for
	   	   System.out.println("Enter a Name to Search For: ");
	   	   name = input.next();

	      //search for a name
	      location = Search.linear(nameCount, name);

	      if (location == -1)

	      {

	   	   System.out.println("Sorry, the Name Isn't in the Array.");

	      }

	      else

	      {
	    	  
	   	   System.out.println("First occurence of this name: " + location);

	      }

		}

	}