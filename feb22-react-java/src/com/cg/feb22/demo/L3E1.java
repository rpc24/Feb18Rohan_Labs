package com.cg.feb22.demo;
import java.util.*;

public class L3E1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integers seperated by spaces");
		String s = sc.nextLine();
		StringTokenizer st = new StringTokenizer(s);
		int sum =0;
		while(st.hasMoreTokens())
		{
			String s1 = st.nextToken();
			int n = Integer.parseInt(s1);
			System.out.println(n);
			sum += n;
		}
		System.out.println(sum);
		
	}
}
