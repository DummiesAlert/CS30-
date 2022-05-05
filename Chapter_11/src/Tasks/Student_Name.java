package Tasks;

	import java.io.Serializable;


	public class Student_Name implements Serializable


	{

		private String firstName;


		private String lastName;

		public Student_Name(String fn, String ln)


		{


			firstName = fn;


			lastName = ln;


			


		}


		


		


		


		public String toString()


		{


			return(firstName + " " + lastName);


		}


	}

