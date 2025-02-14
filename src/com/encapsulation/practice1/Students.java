package com.encapsulation.practice1;

public class Students {
	int id;
	String name;
	private String email;
	String password;

	public void setEmail(String e) {
		// logic to filter invalid emails

		if (e.contains("@")) {
			this.email = e;
		} else {
			System.out.println("Email is not valid ");
		}
	}

	public String getEmail() {

		return this.email;

	}

}
