package feb18.maven.demo;

 import java.util.*;
public class L6E1 {
	

		public static void main(String args[]) {
			HashMap<Integer, String> hm1 = new HashMap<>();
			hm1.put(2, "one");
			hm1.put(1, "two");
			hm1.put(3, "three");
			System.out.println("Mappings of HashMap hm1 are : " + hm1);
			List<Integer> sort=getValues(hm1);
			System.out.println(sort);
		}
		public static List getValues(HashMap mp)
		{
			Set set=mp.entrySet();
			List l1=new ArrayList<>();
			Iterator it=set.iterator();
			while(it.hasNext())
			{
				Map.Entry entry=(Map.Entry)it.next();
				l1.add(entry.getValue());
				
			}
			Collections.sort(l1);
			return l1;
		}
	}
