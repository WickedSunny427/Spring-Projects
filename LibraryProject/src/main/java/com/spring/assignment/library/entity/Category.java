package com.spring.assignment.library.entity;

public class Category {
	private int id;
	private String name;
	private String description;

	public Category(int id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public void getCategoryDetails() {
		System.out.println("========== CATEGORY DETAILS ============" + "\n");
		System.out.println("ID : " + id);
		System.out.println("Name : " + name);
		System.out.println("Description : " + description);
	}
}