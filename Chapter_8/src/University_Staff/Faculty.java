package University_Staff;

public class Faculty extends UEmployee_One {




	


	private String Deptname;


	


	public Faculty(String Fn, String Ln, int Sal, String D) {


		super(Fn, Ln, Sal);


	


		Deptname = D;


	}


	


	


	public String toString() {


		return(super.toString() + " " + Deptname);


		


	}	


	}


