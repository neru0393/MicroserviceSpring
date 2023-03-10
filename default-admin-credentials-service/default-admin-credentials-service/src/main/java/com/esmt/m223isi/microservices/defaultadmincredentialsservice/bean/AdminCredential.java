package com.esmt.m223isi.microservices.defaultadmincredentialsservice.bean;

import org.springframework.stereotype.Component;

@Component
public class AdminCredential {
	
	private String login;
	private String password;
	
	public AdminCredential() {}
	public AdminCredential(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}
	
	// Setters and getters
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
