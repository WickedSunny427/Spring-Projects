package com.spring.ioc.beanfactory.scope;

public class Student {

	private int studentId;
	private String studentName;

	public void getStudntDetails() {
		System.out.println("Student ID : " + studentId);
		System.out.println("Student name : " + studentName);
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}