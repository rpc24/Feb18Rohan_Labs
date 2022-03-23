package feb18.maven.demo;

public class EmployeeException extends RuntimeException {
	
	EmployeeException(String s)
	{
		System.out.println(s);
	}
	public EmployeeException() {
		super();
		// TODO Auto-generated constructor stub
	}
}
