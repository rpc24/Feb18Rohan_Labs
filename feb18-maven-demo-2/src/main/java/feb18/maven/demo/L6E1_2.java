package feb18.maven.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class L6E1_2 {
	
	
		public static List<Integer> getValues(HashMap<String,Integer> hash)
		{
			List<Integer> myList = new ArrayList<Integer>();
			for(Integer i: hash.values())
			{
				myList.add(i);
			}
			Collections.sort(myList);
			return myList;
		}
		
	public static void main(String[] args) {
		HashMap<String,Integer> hashmapObj = new HashMap<String,Integer>();
		
		hashmapObj.put("Nilavro", 16);
		hashmapObj.put("Sayan", 20);

		List<Integer> sortedList = L6E1_2.getValues(hashmapObj);
		
		Iterator<Integer> i = sortedList.iterator();
		System.out.println("Sorted List is: ");
		while(i.hasNext())
		{
			System.out.print(" " + i.next());
		}

	}
	
}
