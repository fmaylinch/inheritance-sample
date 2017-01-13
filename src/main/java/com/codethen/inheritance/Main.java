package com.codethen.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		FrezzerFridge freezer;
		freezer = new FrezzerFridge();
		freezer.turnOn();
		freezer.turnLightOn();
		freezer.unfreeze();

		System.out.println("----");


		Machine fridge = new Fridge();
		Machine fridge2 = new Fridge();
		Machine oven = new Oven();
		Machine oven2 = new Oven();

		// oven.increaseTemp(20);

		List<Machine> list = new ArrayList<>();
		list.add(oven);
		list.add(oven2);
		list.add(fridge);
		list.add(fridge2);
		list.add(freezer);
		list.add(new TV());

		turnMachinesOn(list);
	}


	/** turns on all the given machines */
	private static void turnMachinesOn(List<Machine> machines) {

		for (Machine machine : machines) {
			machine.turnOn();
		}
	}
}
