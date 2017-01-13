package com.codethen.inheritance;

public class Fridge implements Machine {

	@Override
	public void turnOn() {
		System.out.println("Fridge is on");
	}

	void turnLightOn() {
		System.out.println("Light turned on");
	}
}
