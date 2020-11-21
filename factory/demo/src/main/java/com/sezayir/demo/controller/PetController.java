package com.sezayir.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sezayir.demo.entity.Pet;
import com.sezayir.demo.factory.PetFactory;

@RestController
public class PetController {

	@Autowired
	private PetFactory factory;


	@PostMapping("/add/{type}/{name}")
	public ResponseEntity<Pet> addPet(@PathVariable String type, @PathVariable String name) {

		try {

			Pet pet = factory.createPet(type);
			pet.setName(name);
			pet.feed();
			return new ResponseEntity<>(pet, HttpStatus.OK);

		} catch (Exception e) {

			return new ResponseEntity<>(null, HttpStatus.UNPROCESSABLE_ENTITY);
		}

	}

}
