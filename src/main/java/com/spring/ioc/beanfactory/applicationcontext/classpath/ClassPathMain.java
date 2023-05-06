package com.spring.ioc.beanfactory.applicationcontext.classpath;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassPathMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("ClassPath.xml");
		Mark marks = context.getBean("marks", Mark.class);
		marks.getMarks();;
	}
}