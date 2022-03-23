package com.cg.feb22.demo;

public class Customer {

	int cid;
	String name;
	double bill;
	public Customer() {
		cid =0;
		name ="";
		bill =0.0;
	}
	
	public Customer(int cid, String name, double bill) {
		
		this.cid = cid;
		this.name = name;
		this.bill = bill;
	}
	void display()
	{
		System.out.println(name + "with cid =" + cid + " buys worth "+ bill );
	}
public static void main(String[] args) {
	Customer ob = new Customer(101, "Stuart", 505.2);
	ob.display();
}
}
