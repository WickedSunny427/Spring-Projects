package com.spring.ioc.beanfactory.di.setter;

public class Student {

	private int studentId;
	private String studentName;
	private Mark mark;

	// Getter Methods
	public void getStudntDetails() {
		System.out.println("Student ID : " + studentId);
		System.out.println("Student name : " + studentName);
		mark.getMarks();
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setMark(Mark mark) {
		this.mark = mark;
	}
}
