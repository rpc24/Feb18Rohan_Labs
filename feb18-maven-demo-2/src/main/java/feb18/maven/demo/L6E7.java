package feb18.maven.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class L6E7 {
	public static int[] getsorted(int a[])
	{
		for (int i =0; i<a.length; i++) {
			String s= Integer.toString(a[i]);
			String s1 ="";
			for(int j =0; j<s.length(); j++)
			{
				s1 = s.charAt(j) + s1;
			}
			a[i] = Integer.parseInt(s1);
		}
		List<Integer> l = new ArrayList<Integer>();
		for (int i : a) {
			l.add(i);
		}
		Collections.sort(l);
		int arr[] = new int[a.length];
		for (int i = 0; i < l.size(); i++)
            arr[i] = l.get(i);
		return arr;
		
	}
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a[] =new int[10];
	for (int i =0; i<10; i++) {
		a[i]=sc.nextInt();
	}
	int ar[] = getsorted(a);
	for (int i : ar) {
		System.out.println(i);
		
	}
}
}
