package com.sezayir.demo.entity;

public class Cat implements Pet {
	
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

	public String getType() {

		return "CAT";
	}

	public boolean isHungry() {
		return this.hungry;
	}

	public void feed() {
		this.hungry = false;

	}

}
