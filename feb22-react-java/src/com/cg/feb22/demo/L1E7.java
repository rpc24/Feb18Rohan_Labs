package com.cg.feb22.demo;

import java.util.Scanner;

public class L1E7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(checkNumber( n))
		System.out.println("Increasing Number");
		else if(!checkNumber(n))
			System.out.println("Not an Increasing number");
		
	}
	public static boolean checkNumber(int n)
	{
	
		boolean flag = true;
	      
	       while (n > 9) {
	    	    int a = n % 10;
	    	    n = n/10;
	    	   if(a<(n%10))
	    		   flag = false;
	    	    }
	       return flag;
	}
	}


