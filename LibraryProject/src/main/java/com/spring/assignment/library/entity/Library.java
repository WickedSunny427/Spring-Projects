package com.spring.assignment.library.entity;

public class Library {
	private int code;
	private String name;
	private String type;
	private String address;
	private long contact;
	private String email;

	public void setCode(int code) {
		this.code = code;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void getLibraryDetails() {
		System.out.println("================== LIBRARY DETAILS =====================" + "\n");
		System.out.println("NAME : " + name);
		System.out.println("CODE : " + code);
		System.out.println("TYPE : " + type);
		System.out.println("ADDRESS : " + address);
		System.out.println("CONTACT : " + contact);
		System.out.println("EMAIL : " + email + "\n");
	}
}