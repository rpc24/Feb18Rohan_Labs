package com.cg.feb22.demo;
import java.util.*;
public class L1E5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(calculateSum(n));
	}
	public static int calculateSum(int n)
	{
		int i = 0, s=0;
		while(n>0)
		{
			i++;
			if(i%3 ==0 || i%5==0)
			{
				n--;
				s+= i;
			}
		}
		return s;
	}
}
