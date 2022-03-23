package com.cg.feb22.demo;

import java.util.Scanner;

public class L3E8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if(check(s))
		{
			System.out.println("Positive String");
		}
		else
			System.out.println("Not a Positive String");
	}
	public static boolean check(String s)
	{
		s = s.toUpperCase();
		for(int i = 0; i<s.length()-1; i++)
		{
			if(s.charAt(i)> s.charAt(i+1))
				return false;
		}
		return true;
	}

}
