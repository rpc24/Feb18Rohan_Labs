package com.cg.feb22.demo;

import java.util.Scanner;

public class L2E4 {

	public static int removeduplicates(int a[]) {
		int n = a.length;
		if (n == 0 || n == 1) {
			return n;
		}
		int temp[] = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (a[i] != a[i + 1]) {
				temp[j++] = a[i];
			}
		}
		temp[j++] = a[n - 1];
		for (int i = 0; i < j; i++) {
			a[i] = temp[i];
		}
		
		return j;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		n = removeduplicates(a);
		int x=0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] < a[j]) {
					x = a[i];
					a[i] = a[j];
					a[j] = x;
				}
			}
		}
		for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
	}
}
