package com.spring.ioc.beanfactory.di.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("DependencyInjectionSetterBased.xml");
		Student student = context.getBean("student", Student.class);
		student.getStudntDetails();
	}

}