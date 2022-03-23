package com.cg.feb22.demo;

import java.util.Scanner;

public class L3E4 {

	public static int modifyNumber(int n)
	{
		String s = Integer.toString(n);
		String st ="";
		int a = s.length();
		for(int i = 0; i<a-1; i++)
		{
			st = st+ Integer.toString(Math.abs((s.charAt(i)-s.charAt(i+1))));
		}
		st += s.charAt(a-1);
		int b = Integer.parseInt(st);
		return b;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(modifyNumber(a));
		sc.close();
	}

}
