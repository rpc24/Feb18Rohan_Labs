package feb18.maven.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
	

		public static void main(String[] args) {

			List<Employeee> empList = new ArrayList<>();
			empList.add(new Employeee(101, "Sonu", 50000));
			empList.add(new Employeee(102, "Monu", 60000));
			empList.add(new Employeee(103, "Ponu", 45000));
			empList.add(new Employeee(104, "Tonu", 55000));
			empList.add(new Employeee(105, "Gonu", 65000));

			System.out.println("Iterate and print elements with forEach and lambda: ");
			empList.forEach(e -> System.out.println(e.toString()));

			System.out.println("Employees stream with higher salary:");
			List<Employeee> empWithHigherSal = empList.stream().filter(e -> e.getSalary() >= 60000).collect(Collectors.toList());
		
		
			
			empWithHigherSal.forEach(e -> System.out.println(e.toString()));
		}
	}

