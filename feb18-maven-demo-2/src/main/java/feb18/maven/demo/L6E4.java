package feb18.maven.demo;

import java.util.HashMap;
import java.util.Map;

public class L6E4 {
	public static HashMap<Integer, String> getStudents(HashMap<Integer, Integer> m)
	{
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		for(Map.Entry<Integer, Integer> entry : m.entrySet()) {
			Integer key = entry.getKey();
			Integer val = entry.getValue();
			if(val>=70 && val<80)
			{
				map.put(key, "Bronze");
			}
			else if(val>=80 && val<90)
			{
				map.put(key, "Silver");
			}
			else if(val>=90)
			{
				map.put(key, "Gold");
			}
				
		}
		return map;
	}
	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(101, 040);
		map.put(102, 50);
		map.put(103, 60);
		map.put(104, 70);
		map.put(105, 80);
		map.put(106, 90);
		map.put(107, 100);
		HashMap<Integer, String> m = getStudents(map);
		for (Map.Entry<Integer, String> entry : m.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			System.out.println(key + " "  + val);
		}
	}
}
