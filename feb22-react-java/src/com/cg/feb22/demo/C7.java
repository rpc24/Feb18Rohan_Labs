package com.cg.feb22.demo;

import java.util.*;

public class C7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int i = 1;
		for (int j = 1; j <= a; j++)
			i = i * j;
		System.out.println("Factorial of " + a + " is " + i);
	}

}
