package com.qa.Library;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Books book = new Books(657383923, "The last lecture", "Randy Paul", "Penguin");
		Books book2 = new Books(657383923, "The last lecture", "Randy Paul", "Penguin");
		Books book3 = new Books(657383923, "The last lecture", "Randy Paul", "Penguin");
		
		book.addToList(book);
		book2.addToList(book2);
		book3.addToList(book3);
		
		System.out.println(book.getID());
		System.out.println(book2.getID());
		System.out.println(book3.getID()); 
	}

	

}
