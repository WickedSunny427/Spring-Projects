package com.spring.ioc.beanfactory.applicationcontext.classpath;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("DependencyInjection.xml");
		Student student = context.getBean("student", Student.class);
		student.getStudntDetails();
	}
}