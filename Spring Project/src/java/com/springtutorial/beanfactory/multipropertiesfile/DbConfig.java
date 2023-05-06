package com.spring.ioc.beanfactory.multipropertiesfile;

public class DbConfig {
	private String url;
	private String username;
	private String password;

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void getDbDetails() {
		System.out.println("DB URL : " + url);
		System.out.println("DB Username" + username);
		System.out.println("DB Password :" + password);
	}
}