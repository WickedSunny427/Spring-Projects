package com.spring.ioc.beanfactory.applicationcontext.classpath;

public class Mark {

	private int mark1;

	public void setMark1(int mark1) {
		this.mark1 = mark1;
	}

	public void setMark2(int mark2) {
		this.mark2 = mark2;
	}

	private int mark2;

	public void getMarks() {
		System.out.println(mark1);
		System.out.println(mark2);
	}
}