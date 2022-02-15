package com.travel;

public class Travel implements Journey{

	Vehicle v;

	public void startJourney() {
		System.out.println("Journey Started!!");
		v.move();

	}

	public void setV(Vehicle v) {
		this.v = v;
	}


}
