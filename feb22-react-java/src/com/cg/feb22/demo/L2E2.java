package com.cg.feb22.demo;

import java.util.*;

public class L2E2{
	
	public static void sortStrings(String a[])
	{
		int n = a.length;
		for(int i =0; i<n; i++)
		{
			char charArray[] = a[i].toCharArray();
		      Arrays.sort(charArray);
		      a[i]=new String(charArray);
		}
		if(n%2==0)
		{
			for(int i =0; i<=(n/2); i++)
			{
				a[i] = a[i].toUpperCase();
			}
			for(int i = ((n/2)+1); i<n; i++)
			{
				a[i] = a[i].toLowerCase();
			}
			
		}
		else
		{
			for(int i =0; i<=((n/2)+1); i++)
			{
				a[i] = a[i].toUpperCase();
			}
			for(int i = ((n/2)+2); i<n; i++)
			{
				a[i] = a[i].toLowerCase();
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String a[] = new String[n];
		for(int i = 0; i<n; i++)
			a[i] = sc.next();
		sortStrings(a);
		for(int i =0; i<n; i++)
			System.out.println(a[i]);
	}
}