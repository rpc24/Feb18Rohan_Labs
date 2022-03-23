package feb18.maven.demo;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class L6E6 {

	public static List<Integer> voterslist(HashMap<Integer, LocalDate> map)
	{
		List<Integer> a = new ArrayList<Integer>();
		LocalDate d = LocalDate.now();
		for (Map.Entry<Integer, LocalDate> entry : map.entrySet()) {
			Integer key = entry.getKey();
			LocalDate val = entry.getValue();
	  	if((Period.between(val,d).getYears()>18) )
	  		a.add(key);
		}
		return a;
		
	}
	public static void main(String[] args)throws Exception {
		System.out.print("Enter date of birth in YYYY-MM-DD format: ");  
		Scanner sc = new Scanner(System.in);  
		HashMap<Integer, LocalDate> map = new HashMap<Integer, LocalDate>();
		for(int i =0; i<5; i++)
		{
		String s = sc.nextLine();  
		LocalDate dob = LocalDate.parse(s);
		int j = sc.nextInt();
		map.put(j, dob);
		}
		List<Integer> l =voterslist(map);
		l.forEach(e -> {
			System.out.println(e);
		});
	}
}
