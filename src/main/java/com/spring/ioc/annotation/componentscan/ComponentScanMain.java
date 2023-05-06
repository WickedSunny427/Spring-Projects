package com.spring.ioc.di.annotation.componentscan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.ioc.di.annotation.jsr250.injectandnamed.Employee;

public class ComponentScanMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(Configuration.class);
		context.refresh();
		Employee emp = context.getBean("employee", Employee.class);
		emp.getEmployeeDeails();
	}
}
