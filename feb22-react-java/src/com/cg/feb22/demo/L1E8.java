package com.cg.feb22.demo;

import java.util.Scanner;

public class L1E8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(checkNumber( n))
		System.out.println("Power of 2");
		else if(!checkNumber(n))
			System.out.println("Not Power of 2");
	}
	public static boolean checkNumber(int n)
	{
		 if (n == 0)
	            return false;
	 
	        while (n != 1) {
	            if (n % 2 != 0)
	                return false;
	            n = n / 2;
	        }
	        return true;
	}

}
