package com.spring.ioc.di.annotation.qualifier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class EmployeeMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext("com.spring.ioc.di.annotation.qualifier");
		Employee employee = context.getBean("employee",Employee.class);
		employee.getEmployeeDeails();
	}
}