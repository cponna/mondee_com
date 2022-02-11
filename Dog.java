package com.animal;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Dog extends Animal{

	@Column(name="lifetime")
	private String lifeTime;

	@Column(name="name")
	private String name;

	public String getLifeTime() {
		return lifeTime;
	}

	public void setLifeTime(String lifeTime) {
		this.lifeTime = lifeTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}