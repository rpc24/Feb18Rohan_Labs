package feb18.maven.demo;

import java.util.Scanner;

public class L5E3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int salary= 0;
		System.out.println("Enter the salary");
		try
		{
		salary = sc.nextInt();
		if(salary<3000)
			throw new EmployeeException("Low Salary");
		else
			System.out.println("Perfect salary");
		}
		catch(EmployeeException e)
		{
			System.out.println(e);
		}
		sc.close();
		
	}

}
