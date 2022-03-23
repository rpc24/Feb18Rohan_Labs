package feb18.maven.demo;

import java.util.*;

public class Dish{
	String dishName;
	public Dish(String a) {
	dishName = a;	
	}
	public String getDishName() {
		return dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	@Override
	public String toString()
	{
		return "Dish{" + "dishName='" + dishName + '\''+'}';
		}
	
	

}