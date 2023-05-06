package com.spring.ioc.beanfactory.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Scope.xml");
		Student student1 = context.getBean("student", Student.class);
		System.out.println("Hashcode value  : " + student1.hashCode());

		Student student2 = context.getBean("student", Student.class);
		System.out.println("Hashcode value  : " + student2.hashCode());

	}
}