package com.qa.Vehicle;

public class Car extends Vehicle {
	
	private final int wheelNo = 4; 
	
	public Car (String make, String model, String colour, int windowNo, int seatNo) {
		this.type = "Car";
		this.colour = colour;
		this.make = make;
		this.model = model;
		this.windowNo = windowNo;
		this.seatNo = seatNo; 
	}
	

}
