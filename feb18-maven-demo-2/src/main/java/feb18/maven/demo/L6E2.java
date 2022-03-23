package feb18.maven.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class L6E2 {

		public static HashMap<Character, Integer> countchars(char a[])
		{
			HashMap<Character, Integer> map = new HashMap<Character, Integer>();
			for (char c : a) {
			if(map.containsKey(c))
				map.put(c, map.get(c)+1);
			else
				map.put(c, 1);
		}
			return map;
			}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			char a[] = new char[10];
			for(int i =0; i <10; i++)
				a[i] = sc.next().charAt(0);
			HashMap<Character, Integer> map = countchars(a);
			for (Map.Entry<Character, Integer> entry : map.entrySet()) {
				Character key = entry.getKey();
				Integer val = entry.getValue();
				System.out.println(key + " " + val);
				
			}
		}
}
