package cg.feb18.spring.demo.config;
import org.springframework.context.annotation.Bean;

import cg.feb18.spring.demo.entity.EmployeeLab;


public class SpringConfigLab {
	
			@Bean
			public EmployeeLab getEmployee() {
//				return new Employee();
				return new EmployeeLab(103, "Tonu", 60000, "Testing", 28);
	}
	}


