package com.qa.Vehicle;

public class MotorCycle extends Vehicle{
	private final int wheelNo = 2; 
	private final int windowNo = 0; 
	private final int seatNo = 2;
	

	public MotorCycle (String make, String model, String colour) {
		this.type = "Motorcycle";
		this.colour = colour;
		this.make = make;
		this.model = model;
	}

}
