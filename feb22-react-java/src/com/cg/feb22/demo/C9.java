package com.cg.feb22.demo;
import java.util.*;
public class C9 {

	public static void main(String[] args) {
		int a =0, b =1;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(a + " ");
		while(n>1)
		{n--;
        for (int i = 1; i < n; i++)
        {
            System.out.print(b + " ");
            int next = a + b;
            a = b;
            b = next;
        }
		}
	}

}
