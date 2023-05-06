package com.spring.ioc.beanfactory.autowiring.byname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("EmployeeAutowireByName.xml");
		Employee employee = context.getBean("employee", Employee.class);
		employee.getEmployeeDetails();
	}

}