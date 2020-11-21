package com.sezayir.demo.factory;

import org.springframework.stereotype.Component;

import com.sezayir.demo.entity.Cat;
import com.sezayir.demo.entity.Dog;
import com.sezayir.demo.entity.Pet;

@Component
public class PetFactory {
	public Pet createPet(String petType) {

		switch (petType.toLowerCase()) {
		case "dog":
			return new Dog();

		case "cat":
			return new Cat();

		default:
			throw new UnsupportedOperationException("Unknown animal type!!!");
		}

	}

}
