package cg.feb18.spring.demo.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeLab2 {

			private int eid;
			private String firstName;
			private double salary;
			private String buisnessUnit;
			private int age;
			
			@Autowired
			public EmployeeLab2() {
				super();
				this.eid = 102;
				this.firstName = "Monu";
				this.salary = 60000;
				this.age = 28;
				this.buisnessUnit = "Management";
			}

			public EmployeeLab2(int eid, String firstName, double salary, String s, int a) {
				super();
				this.eid = eid;
				this.firstName = firstName;
				this.salary = salary;
				buisnessUnit = s;
				age = a;
			}

			public int getEid() {
				return eid;
			}

			public void setEid(int eid) {
				this.eid = eid;
			}

			public String getFirstName() {
				return firstName;
			}

			public void setFirstName(String firstName) {
				this.firstName = firstName;
			}

			public double getSalary() {
				return salary;
			}

			public void setSalary(double salary) {
				this.salary = salary;
			}
			

			public String getBuisnessUnit() {
				return buisnessUnit;
			}

			public void setBuisnessUnit(String buisnessUnit) {
				this.buisnessUnit = buisnessUnit;
			}

			public int getAge() {
				return age;
			}

			public void setAge(int age) {
				this.age = age;
			}

			@Override
			public String toString() {
				return "Employee [eid=" + eid + ", firstName=" + firstName + ", salary=" + salary + ", Buisness Unit=" + buisnessUnit  + ", age=" + age+ "]" + "\n" +getSbuDetails().toString() ;
			}
			
			public SBULab getSbuDetails()
			{
				return new SBULab();
			}
		}









