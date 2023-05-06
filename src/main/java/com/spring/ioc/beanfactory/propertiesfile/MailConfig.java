package com.spring.ioc.beanfactory.propertiesfile;

public class MailConfig {

	private String host;
	private String username;
	private String password;

	public void setHost(String host) {
		this.host = host;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void getMailDetails() {
		System.out.println("Host : " + host);
		System.out.println("Username : " + username);
		System.out.println("Password : " + password);
	}
}