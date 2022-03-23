package com.cg.feb22.demo;
import java.util.*;
public class L1E1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c=0,a =0;
		while(n>0)
		{
			a = n%10;
			c = c+(a*a*a);
			n = n /10;
		}
		System.out.println(c);
	}

}
