package com.spring.ioc.di.annotation.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext("com.spring.ioc.di.annotation.autowire");
		Employee employee = context.getBean("employee",Employee.class);
		employee.getEmployeeDeails();
	}
}