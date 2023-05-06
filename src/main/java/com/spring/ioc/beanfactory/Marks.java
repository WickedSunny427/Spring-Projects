package com.spring.ioc.beanfactory;

public class Marks {

	private int english;
	private int hindi;

	public Marks() {
		this.english = 84;
		this.hindi = 79;
	}

	public void getMarksDetails() {
		System.out.println("English Marks : " + english + "\t" + "Hindi Marks : " + hindi);
	}
}