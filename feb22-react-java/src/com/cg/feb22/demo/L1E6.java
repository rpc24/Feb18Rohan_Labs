package com.cg.feb22.demo;

import java.util.Scanner;

public class L1E6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(calculateDifference(n));
		
	}
	public static int calculateDifference(int n)
	{
		int s=0,s1=0,s2=0;
		for(int i =1; i<=n; i++)
		{
			s1 = s1+ (i*i);
		}
		for(int i =1; i<=n;i++)
			s2 = s2+ i;
		s2 = s2*s2;
		s = s1-s2;
		return s;
	}

}
