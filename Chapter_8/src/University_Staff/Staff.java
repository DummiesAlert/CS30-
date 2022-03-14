package University_Staff;

public class Staff extends UEmployee_One {




	


	private String jobTitle;







		public Staff(String Fn, String Ln, int Sal, String Job) {


			super(Fn, Ln, Sal);


			


			jobTitle = Job;		


		}












		public String toString() {


			return(super.toString() + " " + jobTitle);







			


 }


}

