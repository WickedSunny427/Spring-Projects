package com.spring.ioc.di.annotation.autowire.assignment.college;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Value("Ritesh")
	private  String name;
	
	@Resource
	private Course course;
	
	public void getStudentDetails() {
		System.out.println("Student Name : "+name);
		course.getCourseDetails();
	}
}
