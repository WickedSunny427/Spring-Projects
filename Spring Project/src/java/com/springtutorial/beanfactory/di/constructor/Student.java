package com.spring.ioc.beanfactory.di.constructor;

public class Student {

	private int studentId;
	private String studentName;
	private Mark mark;

	public Student(int studentId, String studentName, Mark mark) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.mark = mark;
	}

	// Getter Methods
	public void getStudntDetails() {
		System.out.println("Student ID : " + studentId);
		System.out.println("Student name : " + studentName);
		mark.getMarks();
	}
}