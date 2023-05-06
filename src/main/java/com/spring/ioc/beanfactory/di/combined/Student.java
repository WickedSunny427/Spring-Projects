package com.spring.ioc.beanfactory.di.combined;

public class Student {
	private int rollNumber;
	private String name;
	private Marks marks;

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMarks(Marks marks) {
		this.marks = marks;
	}

	public void getStudentMarksDetails() {
		System.out.println("Roll Number : " + rollNumber);
		System.out.println("Name : " + name);
		marks.getMarks();
	}
}