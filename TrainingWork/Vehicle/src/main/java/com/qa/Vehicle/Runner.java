package com.qa.Vehicle;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("VW", "Polo", "black", 3, 5); 
		Car car2 = new Car("VW", "Golf", "Green", 5, 4); 
		Car car3 = new Car("Mercedes", "A Class", "Yellow", 3, 2); 
		
		MotorCycle m1 = new MotorCycle("Suzuki", "F456", "Red");
		MotorCycle m2 = new MotorCycle("Motor", "F56", "Lime green");
		
		Plane p1 = new Plane("Airbus", "A380", "Grey", 226, 800);
		
		Garage g = new Garage();
		g.addToGarage(car1);
		g.addToGarage(car2);
		g.addToGarage(car3);
		g.addToGarage(m1);
		g.addToGarage(m2);
		g.addToGarage(p1);
		
		g.getGarageList().stream().forEach(e-> System.out.println(e.toString()));
		g.CalculatingBill(car1);
	}

}
