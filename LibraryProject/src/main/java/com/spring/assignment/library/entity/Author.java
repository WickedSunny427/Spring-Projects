package com.spring.assignment.library.entity;

import java.util.Set;

public class Author {
	private int id;
	private String name;
	private String description;
	private Set<Book> books;

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}

	public String getName() {
		return name;
	}

	public void getAuthorDetails() {
		System.out.println("========== AUTHOR DETAILS ============" + "\n");
		System.out.println("ID : " + id);
		System.out.println("Name : " + name);
		System.out.println("About Author : " + description);
		for (Book book : books) {
			System.out.println("Books written : " + book.getName());
		}
		System.out.println();
	}
}