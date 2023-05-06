package com.spring.ioc.beanfactory.di.combined;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SudentMarkMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"DependencyInjectionSetterAndConstructorBased.xml");
		Student student = context.getBean("student", Student.class);
		student.getStudentMarksDetails();
	}
}