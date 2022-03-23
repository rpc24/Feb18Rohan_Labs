package com.cg.feb22.demo;

public class Employee {

	int eid;
	String name;
	double salary;
	public Employee() {
		System.out.println("Constructor called");
	}
	Employee(int a, String b, double c)
	{
		eid =a;
		name = b;
		salary = c;
	}
	
	
	void work()
	{
		System.out.println(name + " works");
	}
	@Override
	public String toString() {
		
		return ("Employee [eid=" + eid + ", name=" + name +", salary ="+ salary + "]");
	}

}
