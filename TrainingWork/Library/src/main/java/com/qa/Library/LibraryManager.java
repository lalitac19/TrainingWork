package com.qa.Library;

import java.util.ArrayList;


public class LibraryManager {

	ArrayList <Library> checkedOutItems;
	ArrayList <Library> items;
	
	public LibraryManager() {
	checkedOutItems = new ArrayList <Library>();
	items = new ArrayList <Library>(); 
	}
	
	public void addToList(Library item) {
		this.items.add(item);
	}
	
	public void removeItem(Library item) {
		this.items.remove(item);
	}
	
	public ArrayList<Library> getCheckedOutList(){
		return items; 
	}
	
	public ArrayList<Library> getItemList(){
		return checkedOutItems; 
	}
}
