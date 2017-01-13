package com.codethen.inheritance;

public class Oven implements Machine {

	private int temperature;

	public Oven() {
		this.temperature = 0;
	}

	@Override
	public void turnOn() {
		System.out.println("Oven is on");
	}

	public void increaseTemp(int inc) {
		this.temperature += inc;
	}
}
