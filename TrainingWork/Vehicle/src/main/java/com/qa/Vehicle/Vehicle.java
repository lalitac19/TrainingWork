package com.qa.Vehicle;

public abstract class Vehicle {
	protected String make;
	protected String model;
	protected int wheelNo;
	protected String colour; 
	protected int windowNo;
	protected int seatNo; 
	protected String type; 
	
	public void Move() {
		System.out.println("vehicle has moved forward");
	}
	public void Stop() {
		System.out.println("vehicle has stopped");
	}
	public void TurnLeft() {
		System.out.println("vehicle has turned left");
	}
	public void TurnRight() {
		System.out.println("vehicle has turned right");
	}
	
	public String toString () {
	return 
			getType() +" Details: Make: " + getMake() + " Model: " + getModel() + " Colour: " + getColour() + " Number of wheels: " + getWheels() + " Number of seats: " + getSeats() + " Number of windows: " + getWindows();
	}
	
	//getters
	public String getMake() {
		return this.make; 
	}
	public String getType() {
		return this.type; 
	}
	public String getModel() {
		return this.model; 
	}
	
	public String getColour() {
		return this.colour; 
	}
	public int getWheels() {
		return this.wheelNo; 
	}
	public int getWindows() {
		return this.windowNo; 
	}
	public int getSeats() {
		return this.seatNo; 
	}
	
	//setters 
	public void setMake(String make) {
		this.make = make; 
	}
	public void setModel(String m) {
		this.model = m;  
	}
	public void setColour(String c) {
		this.colour = c; 
	}
	public void setWheels(int w) {
		this.wheelNo = w; 
	}
	public void setWindows(int w) {
		this.windowNo = w;  
	}
	public void setSeats(int s) {
		this.seatNo = s; 
	}
	public void setType(String t) {
		this.type = t; 
	}
	
	public int calculate(Vehicle tempV) {
		int total;
		total = (int) ((tempV.getSeats() * tempV.getWheels()) + ( Math.random()*5))*1000;
		return total;
		
	}
	
}
