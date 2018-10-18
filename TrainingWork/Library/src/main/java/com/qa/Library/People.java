package com.qa.Library;

public class People {

	private String name;
	private String number;
	//arraylist for books they have checked in & out
	
	private int ID; 
	
	
	public People (String name, String num, int id) {
		this.setName(name);
		this.setNumber(num);
		this.setID(id);
		
		
	}
	public void registerPerson(String name) {
		
	}
	
	public void DeletePerson(int ID) {
		
	}

	public void UpdatePerson(String name) {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
}
