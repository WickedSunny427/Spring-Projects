package com.spring.ioc.beanfactory.di.combined;

public class Marks {

	private int marks1;
	private int marks2;
	private int marks3;
	private int marks4;

	public Marks(int marks1, int marks2, int marks3, int marks4) {
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
		this.marks4 = marks4;
	}

	public void getMarks() {
		System.out.println("Mark 1 : " + marks1);
		System.out.println("Mark 2 : " + marks2);
		System.out.println("Mark 3 : " + marks3);
		System.out.println("Mark 4 : " + marks4);
	}
}