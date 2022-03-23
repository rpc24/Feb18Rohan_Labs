package cg.feb18.spring.demo.config;
import org.springframework.context.annotation.Bean;

import cg.feb18.spring.demo.entity.EmployeeLab2;


public class SpringConfigLab2 {
	
			@Bean
			public EmployeeLab2 getEmployee() {
//				return new Employee();
				return new EmployeeLab2(103, "Tonu", 60000, "Testing", 28);
	}
	}

