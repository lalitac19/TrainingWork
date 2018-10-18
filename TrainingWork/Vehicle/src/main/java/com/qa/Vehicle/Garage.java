package com.qa.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Garage {

	private ArrayList <Vehicle> vehicleList;  
	
	public Garage() {
		vehicleList = new ArrayList <Vehicle>(); 
		
	}
	public void addToGarage(Vehicle v) {
		this.vehicleList.add(v);
	}
	
	public ArrayList<Vehicle> getGarageList(){
		return vehicleList; 
	}
	
	public void CalculatingBill (Vehicle vehicle) {
		List<Vehicle> tempList = new ArrayList<Vehicle>(); 
		switch (vehicle.getType()) {
		case "Car":
		tempList = vehicleList.stream().filter(e -> e.getType().equals("Car")).collect(Collectors.toList());
		System.out.println("Car Prices: £");
		tempList.stream().map(i-> i.calculate(i)).forEach(e-> System.out.println(e.toString()));
		break;
		case "Plane":
		tempList = vehicleList.stream().filter(e -> e.getType().equals("Plane")).collect(Collectors.toList());
		System.out.println("Plane Prices: £");
		tempList.stream().map(i-> i.calculate(i)).forEach(System.out::println); 
		break;
		case "Motorcycle":
		tempList = vehicleList.stream().filter(e -> e.getType().equals("Motorcycle")).collect(Collectors.toList());
		System.out.println("Motorcycle Prices: £");
		tempList.stream().map(i-> i.calculate(i)).forEach(System.out::println); 
		break;
		}
	}
	
	public void emptyGarage(ArrayList<Vehicle> vehicleList) {
		vehicleList.clear(); 
	}
	
	public void addVehicle(Vehicle vehicle) {
		vehicleList.add(vehicle); 
	}
	
	public void removeVehicle(Vehicle vehicle) {
		vehicleList.remove(vehicle); 
	}

}
