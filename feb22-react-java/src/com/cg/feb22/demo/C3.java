package com.cg.feb22.demo;
import java.util.*;
public class C3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a%2==0)
		{
			System.out.println("Smallest even number not smaller than given number is "+ (a+2));
			System.out.println("Largest odd number not larger than given number is "+ (a-1));
		}
		else
		{
			System.out.println("Smallest even number not smaller than given number is "+ (a+1));
			System.out.println("Largest odd number not larger than given number is "+ (a-2));
		}
	}
}
