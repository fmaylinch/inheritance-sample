package com.codethen.inheritance;

public class FrezzerFridge extends Fridge {

	@Override
	public void turnOn() {
		System.out.println("Frezzer is on");
	}

	void unfreeze() {
		System.out.println("unfreezing!");
	}
}
