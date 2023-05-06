package com.spring.ioc.beanfactory.di.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("DependencyInjectionSetterBased.xml");
		Employee employee = context.getBean("employee", Employee.class);
		employee.getEmployeeDetails();
	}

}