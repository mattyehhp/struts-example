package com.mattyeh;

import com.opensymphony.xwork2.ActionSupport;

public class HellosAction extends ActionSupport {
	
	private String firstName;
	
	public String execute() {
		System.out.println("Value of the firstname: " + firstName);
		return SUCCESS;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
}