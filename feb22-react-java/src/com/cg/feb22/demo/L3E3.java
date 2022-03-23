package com.cg.feb22.demo;
import java.util.*;
public class L3E3 {

	public static String alterString(String s)
	{
		int n = s.length();
		String st="";
		for(int i = 0 ; i < n; i ++)
		{
			if(s.charAt(i)=='a'|| s.charAt(i) =='e' || s.charAt(i)=='i' || s.charAt(i)== 'o' || s.charAt(i)=='u'|| s.charAt(i) == 'A' || s.charAt(i) == 'E' ||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
			{
				st = st + s.charAt(i);
			}
			else
			{
				st = st + (char)(s.charAt(i)+1);
			}
		}
		return st;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(alterString(s));
	}

}
