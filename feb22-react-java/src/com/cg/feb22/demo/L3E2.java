package com.cg.feb22.demo;

import java.util.Scanner;

public class L3E2 {

	public static String getImage(String s)
	{
		String st="";
		int n = s.length();
		while(n>0)
		{
			st = st+ s.charAt(n-1);
			n--;
		}
		s = s + "|" + st;
		return s;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(getImage(s));
	}
}
