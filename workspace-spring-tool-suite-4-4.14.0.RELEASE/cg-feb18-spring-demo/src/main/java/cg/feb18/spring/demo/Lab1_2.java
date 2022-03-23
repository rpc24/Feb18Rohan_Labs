package cg.feb18.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;

import cg.feb18.spring.demo.config.SpringConfigLab2;
import cg.feb18.spring.demo.entity.EmployeeLab2;

@ComponentScan
public class Lab1_2 {
	
			public static void main(String[] args) {
				ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigLab2.class);

				EmployeeLab2 emp = context.getBean(EmployeeLab2.class);
				System.out.println(emp.toString());

				((AbstractApplicationContext) context).close();

			}


}
