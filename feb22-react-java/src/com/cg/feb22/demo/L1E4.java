package com.cg.feb22.demo;
import java.util.*;
public class L1E4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i<=n ; i++)
		{
			int c =0;
			for(int j = 1; j<=i; j++)
			{
				if(i%j ==0)
					c++;
			}
			if(c==2)
				System.out.println(i + " ");
			
		}
		
	}
}
