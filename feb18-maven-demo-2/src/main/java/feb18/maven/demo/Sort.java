package feb18.maven.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Sort {
	

		public static void main(String[] args) {

			List<Employee> empList = new ArrayList<>();
			empList.add(new Employee(103, "Sonu", 50000));
			empList.add(new Employee(101, "Monu", 90000));
			empList.add(new Employee(104, "Tonu", 60000));
			empList.add(new Employee(102, "Ponu", 55000));

			System.out.println("Initial empList");
			empList.forEach(e -> System.out.println(e.toString()));

			Collections.sort(empList);

			System.out.println("after sorting empList");
			empList.forEach(e -> System.out.println(e.toString()));
		}

	}


