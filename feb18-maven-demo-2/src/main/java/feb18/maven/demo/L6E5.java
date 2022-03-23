package feb18.maven.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class L6E5 {
public static int getSecondSmallest(int a[])
{
	List<Integer> list = new ArrayList<>();

	for (int x : a) {
		list.add(x);
	}
	Collections.sort(list);
	return list.get(1);
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a[] =new int[10];
	for (int i =0; i<10; i++) {
		a[i]=sc.nextInt();
	}
	System.out.println("Second Smallest Element : " + L6E5.getSecondSmallest(a));
}
}
