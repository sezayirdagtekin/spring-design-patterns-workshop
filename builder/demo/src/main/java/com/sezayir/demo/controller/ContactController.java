package com.sezayir.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sezayir.demo.builder.ContactBuilder;
import com.sezayir.demo.entity.Contact;

@RestController
public class ContactController {

	@GetMapping("/people")
	public List<Contact> getContacts() {

		List<Contact> contacts = new ArrayList<Contact>();

		Contact contact1 = new ContactBuilder().setFirstName("Sezayir").setLastName("Dagtekin")
				.setEmailAddress("test@gmail.com").build();
		Contact contact2 = new ContactBuilder().setFirstName("Cem").setLastName("Toker")
				.setEmailAddress("cmtk@yahoo.com").build();

		contacts.add(contact1);
		contacts.add(contact2);
		
		return contacts;
	}

}
