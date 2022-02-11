package com.vehicle;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


@Inheritance(strategy = InheritanceType.JOINED)
@Entity(name="vehicle")
public class vehicle {

	@Id
	private double id;

	public double getId() {
		return id;
	}

	public void setId(double id) {
		this.id = id;
	}



}