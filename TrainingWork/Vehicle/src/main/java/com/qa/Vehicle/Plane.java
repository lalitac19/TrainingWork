package com.qa.Vehicle;

public class Plane extends Vehicle{
	
	
	public Plane(String make, String model, String colour, int windowNo, int seatNo) {
		this.colour = colour;
		this.make = make;
		this.model = model;
		this.windowNo = windowNo;
		this.seatNo = seatNo; 
		this.type = "Plane";
	}
	
	
	
public void Move() {
	System.out.println("Plane is flying");
}

public void Landing() {
	System.out.println("Plane is Landing");
}

}
