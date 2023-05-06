package com.spring.ioc.beanfactory;

public class Student {

	private int rollNumber;
	private String name;

	public Student() {
		this.rollNumber = 465;
		this.name = "Sunny";
	}

	public void getStudentDetails() {
		System.out.println("Roll Number : " + rollNumber + "\t" + "Student Name : " + name);
	}
}