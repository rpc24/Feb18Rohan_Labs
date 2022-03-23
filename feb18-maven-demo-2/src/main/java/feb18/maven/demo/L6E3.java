package feb18.maven.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class L6E3 {
	public static HashMap<Integer, Integer> getSquares(int a[])
	{
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i : a) {
			map.put(i, i*i);
			
		}
		return map;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] =new int[10];
		for (int i =0; i<10; i++) {
			a[i]=sc.nextInt();
		}
		HashMap<Integer, Integer> map = getSquares(a);
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			Integer key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println(key + " " + val);
		}
	}
}
