package feb18.maven.demo;

import java.util.Scanner;

public class L5E2_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String first = "";
		String last = "";
		System.out.println("Enter first name");
		first = sc.next();
		System.out.println("Enter last name");
		last = sc.next();
		try
		{
			if(first == "" || last == "")
				throw new L5E2("Blank name");
			else
				System.out.println(first + " "+ last);
		}
		catch (L5E2 e) {
		System.out.println(e);	
		}
	}

}
