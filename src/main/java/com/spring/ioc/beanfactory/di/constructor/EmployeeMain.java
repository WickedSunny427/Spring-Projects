package com.spring.ioc.beanfactory.di.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("DependencyInjectionConstructorBased.xml");
		Employee employee = context.getBean("employee", Employee.class);
		employee.getEmployeeDetails();
	}

}