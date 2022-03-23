package com.cg.feb22.demo;

import java.util.Scanner;

public class L1E3 {

	public static void Fibonacci(int n)
	{
	int a =0, b =1;
	
	while(a<=n)
	{
   
        System.out.print(a + " ");
        int next = a + b;
        a = b;
        b = next;
    
	}
	}
	public static int Fibonacci_Recursion(int n)
	{
		if (n <= 1)
            return n;
        return (Fibonacci_Recursion(n - 1) + Fibonacci_Recursion(n - 2));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Fibonacci( n);
		System.out.println("");
		 for (int i = 0; i < n; i++) 
			  
	            System.out.print(Fibonacci_Recursion( n) + " ");
	}
}
