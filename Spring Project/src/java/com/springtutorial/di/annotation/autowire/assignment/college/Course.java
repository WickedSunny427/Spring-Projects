package com.spring.ioc.di.annotation.autowire.assignment.college;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Course {

	@Value("Semester 1")
	private String course1;

	@Value("Semester 2")
	private String course2;

	public void getCourseDetails() {
		System.out.println("Course 1 : " + course1);
		System.out.println("Course 2 : " + course2);
	}
}