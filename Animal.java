package com.animal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity(name="animal")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Animal {

	@Id
	private int aid;

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}
}