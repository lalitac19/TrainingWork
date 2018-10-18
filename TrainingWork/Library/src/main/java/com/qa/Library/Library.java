package com.qa.Library;

import java.util.ArrayList;

public abstract class Library {
	
	private String type;
	private String name; 
	private int ID;
	private static int counter;
	
	ArrayList <Object> checkedOutItems = new ArrayList <Object>();
	static ArrayList <Object> items = new ArrayList <Object> ();
	
	public boolean updateItem (int newID ) {
		boolean done = false;
		System.out.println(items.toString());
		
		while (done == false) {
			for (int x = 0; x < items.size(); x++) {
				if ( ((Library) items.get(x)).getID() == this.getID()) {
					System.out.println("Item EXXIIIISSSSTTTSSS");
					this.changeID(newID);
					done = true; 
					break;
				} 
		}
		}
		System.out.println("New Arraylist is: " + items.toString());
		return done; 
	}
	
	public String toString() {
		return "The "+ this.getType()+ " details are: " + this.getID() + " " + this.getName();
	}
	
	
public  boolean updateItem(String oldName, String newName ) {
	boolean done = false;
	while (done == false) {
		for (int x = 0; x < items.size(); x++) {
			if (((Library) items.get(x)).getName().equals(this.getName())) {
				this.setName(newName);
				done = true; 
				break;
		}
	}
	}
	System.out.println("New Arraylist is: " + items.toString());
	return done; 
}
/*
public boolean updateItem (String oldAuthor, String newAuthor) {
	
}*/
	//public abstract void addItem(String type, String name);
	
	public int addToList(Object item) {
		items.add(item);
		counter ++;
	return items.size();
	}
	
	public int checkOut(Library item) {
		checkedOutItems.add(item);
		return checkedOutItems.size();
	}
	
	public int removeItem(Library item) {
		items.remove(item);
		return items.size();
	}
	
	public ArrayList<Object> getCheckedOutList(){
		return checkedOutItems; 
	}
	
	public static void printItemList(){
		System.out.println(items);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getID() {
		return this.ID;
	}
	public void changeID(int id) {
		this.ID = id;
	}

	public void setID() {
	counter++;
	this.ID = counter; 
	}

}
