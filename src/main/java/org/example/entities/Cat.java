package org.example.entities;

import org.springframework.stereotype.Component;

//class Cat {
@Component("mya")
public class Cat {
	private String name;

	Cat() {
		this.name = "Meme";
	}

	Cat(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
}