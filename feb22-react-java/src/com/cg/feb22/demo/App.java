package com.cg.feb22.demo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class App {
	static int num =10;
	int num2 = 20;
	static void enterPremises()
	{
		System.out.println("I am in the cinema premise now.");
	}
	void enterHall()
	{
		System.out.println("I am in the hall now.");
	}
	public static void main(String Args[])
	{
		System.out.println(num);
		enterPremises();
		App ob = new App();
		ob.enterHall();
		System.out.println(ob.num2);
		String s = "10";
		int i = Integer.parseInt(s);
		System.out.println(i);
		LocalDate dt = LocalDate.now();
		System.out.println(dt);
		LocalDateTime t = LocalDateTime.now();
		System.out.println(t);
	}
}
