package feb18.maven.demo;

import java.util.Scanner;

public class L5E1_2 {

	//private static final long serialVersionUID = 1L;

		public L5E1_2(String str) {
		
		
	}

		public static void main(String[] args) {
		  Scanner s = new Scanner(System.in);
		  System.out.print("Enter ur age :: ");
		  int age = s.nextInt();
		  
		  try {
		   if(age < 18) 
		    throw new L5E1("Invalid age");
		   else
		    System.out.println("Valid age");
		  } catch (L5E1 a) {
		   System.out.println(a);
		  }
		 }
		}

