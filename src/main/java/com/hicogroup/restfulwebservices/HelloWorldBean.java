package com.hicogroup.restfulwebservices;

public class HelloWorldBean {
	
	private String message;
	
	public HelloWorldBean(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return String.format("[message=%s]", message);
	}

	
	
	

}
