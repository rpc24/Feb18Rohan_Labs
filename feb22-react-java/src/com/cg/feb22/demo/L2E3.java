package com.cg.feb22.demo;

import java.util.Scanner;

public class L2E3 {

	public static int getSorted(int a[])
	{
		int n = a.length, x=0;
		for(int i = 0; i<n; i++ )
		{
			int r = 0;
			int n1 = a[i];
			while(n1>0)
			{
				r = r*10 + (n1%10);
				n1 = n1/10;
			}
			a[i] = r;
		}
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					x = a[i];
					a[i] = a[j];
					a[j] = x;
				}
			}
		}
		return n;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		n = getSorted(a);
		for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");

}
}
