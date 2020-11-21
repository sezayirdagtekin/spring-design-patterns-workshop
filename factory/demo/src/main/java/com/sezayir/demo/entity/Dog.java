package com.sezayir.demo.entity;

public class Dog implements Pet {

	private String name;
	private boolean hungry;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHungry(boolean hungry) {
		this.hungry = hungry;
	}

	public boolean isHungry() {

		return this.hungry;
	}

	public void feed() {
		this.hungry = false;
	}

	public String getType() {

		return "DOG";
	}

}
