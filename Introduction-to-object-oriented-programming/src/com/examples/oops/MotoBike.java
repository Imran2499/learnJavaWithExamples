package com.examples.oops;

public class MotoBike {
	// state
	private int speed; // instance variiable.

	public MotoBike() {
		this(5);
	}

	MotoBike(int speed) { // constructor
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed > 0)
			this.speed = speed;
	}

	public void increaseSpeed(int howMuch) {
		setSpeed(this.speed + howMuch);
	}

	public void decreaseSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);
	}

	public void strat() {
		System.out.println("Bike Strated");
	}

}
