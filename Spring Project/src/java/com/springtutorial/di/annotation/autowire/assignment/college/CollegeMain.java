package com.spring.ioc.di.annotation.autowire.assignment.college;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CollegeMain {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(
				"com.spring.ioc.di.annotation.autowire.assignment.college");

		College college = context.getBean("college", College.class);
		Student student = context.getBean("student", Student.class);

		college.getCollegeDetails();
		student.getStudentDetails();
	}
}