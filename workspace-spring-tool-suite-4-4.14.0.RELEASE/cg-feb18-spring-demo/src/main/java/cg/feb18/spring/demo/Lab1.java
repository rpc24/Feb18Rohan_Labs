package cg.feb18.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;

import cg.feb18.spring.demo.config.SpringConfigLab;
import cg.feb18.spring.demo.entity.EmployeeLab;

@ComponentScan
public class Lab1 {
	
			public static void main(String[] args) {
				ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigLab.class);

				EmployeeLab emp = context.getBean(EmployeeLab.class);
				System.out.println(emp.toString());

				((AbstractApplicationContext) context).close();

			}


}
