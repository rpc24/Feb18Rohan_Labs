package feb18.maven.demo;

import java.util.*;
import java.util.stream.Collectors;
 

public class DishTest {

	public List<Dish> addYummyToName(List<Dish> list)
	{
		List<Dish> li = new ArrayList<>();
		List<String> l = list.stream().map(s -> "Yummy: " + s.getDishName()).collect(Collectors.toList());
		for (String string : l) {
			Dish e = new Dish(string);
			li.add(e);
			
		}
		return li;
	}
	public long count(List<Dish> list,  String s1)
	{
		List<String> l = new ArrayList<>();
		for (Dish s : list) {
			l.add(s.getDishName());
		}
		long a = l.stream().filter(y -> y.indexOf(s1) != -1).count();
		return a;
}
public static void main(String[] args) {
	DishTest d = new DishTest();
	List<Dish> l = new ArrayList<Dish>();
	l.add(new Dish("POtata"));
	l.add(new Dish("Boorgir"));
	l.add(new Dish("Maccheese"));
	l.add(new Dish("Boorgir"));
	List<Dish> s=  d.addYummyToName(l);
	Long a =d.count(l, "Bor");
	System.out.println(s);
	System.out.println(a);
}}