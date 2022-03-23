package com.cg.feb22.demo;
import java.util.*;
public class L1E2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter red, yellow or green");
		String c = sc.next();
		switch(c)
		{
		case "red":
			System.out.println("Stop");
			break;
		case "yellow":
			System.out.println("Ready");
			break;
		case "green":
			System.out.println("Go");
			break;
		default:
			System.out.println("wrong input");
		}
	}
}
