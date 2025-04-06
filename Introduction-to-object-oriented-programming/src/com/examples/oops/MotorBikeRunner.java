package com.examples.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotoBike ducati = new MotoBike(100);
		MotoBike honda = new MotoBike(100);
		MotoBike someOneOtherCompany = new MotoBike();
		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
		System.out.println(someOneOtherCompany.getSpeed());

		ducati.strat();
		honda.strat();

		ducati.setSpeed(100);
		honda.setSpeed(80);

		ducati.increaseSpeed(100);
		honda.increaseSpeed(100);

		ducati.decreaseSpeed(50);
		honda.decreaseSpeed(50);

		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());

	}
}
