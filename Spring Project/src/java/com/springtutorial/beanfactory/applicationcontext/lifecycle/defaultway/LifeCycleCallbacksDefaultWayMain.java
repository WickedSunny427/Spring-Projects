package com.spring.ioc.beanfactory.applicationcontext.lifecycle.defaultway;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleCallbacksDefaultWayMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("LifeCycleDefaultWay.xml");
		Employee employee = context.getBean("employee", Employee.class);
		employee.getEmployeeDetails();

		context.registerShutdownHook();
	}
}