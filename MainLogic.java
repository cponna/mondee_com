package com.travel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLogic {

	public static void main(String args[]) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		Car car = (Car) ac.getBean("kia");
		car.move();
		Bike bike = (Bike) ac.getBean("ktm");
		bike.move();

		//System.out.println(st.getSid()+" "+st.getSname()+" "+st.getSmarks());
	}
}
