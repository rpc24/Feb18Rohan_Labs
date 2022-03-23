package com.cg.feb22.demo;
import java.util.*;
public class L3E5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char ch[] = s.toCharArray();
		System.out.println("Number of characters: " + ch.length);
		String a[] = s.split(" ");
		System.out.println(a.length);
		String b[] = s.split("[!?.]");
		System.out.println(b.length);
	}
}
