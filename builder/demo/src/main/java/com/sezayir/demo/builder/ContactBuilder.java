package com.sezayir.demo.builder;

import com.sezayir.demo.entity.Contact;

public class ContactBuilder {

	private String firstName;
	private String lastName;
	private String emailAddress;

	public ContactBuilder setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public ContactBuilder setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public ContactBuilder setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
		return this;
	}

	public Contact build() {
		return new Contact(firstName, lastName, emailAddress);
	}

}
