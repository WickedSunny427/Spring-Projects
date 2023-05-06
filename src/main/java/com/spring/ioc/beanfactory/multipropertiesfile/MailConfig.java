package com.spring.ioc.beanfactory.multipropertiesfile;

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
		System.out.println("Mail Host : " + host);
		System.out.println("Mail Username : " + username);
		System.out.println("Mail Password : " + password);
	}
}