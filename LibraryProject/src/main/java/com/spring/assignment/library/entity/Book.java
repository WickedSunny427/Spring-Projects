package com.spring.assignment.library.entity;

import java.util.List;

public class Book {
	private int id;
	private String name;
	private String category;
	private String description;
	private int price;
	private List<Author> authors;

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public String getName() {
		return name;
	}

	public void getBookDetails() {
		System.out.println("=============BOOK DETAILS =============" + "\n");
		System.out.println("ID : " + id);
		System.out.println("Name : " + name);
		System.out.println("Category : " + category);
		System.out.println("Description : " + description);
		System.out.println("Price : " + price);
		System.out.println("Author(s) :");

		for (Author author : authors) {
			System.out.println("Writtenn by : " + author.getName());
		}
		System.out.println("\n");

	}
}