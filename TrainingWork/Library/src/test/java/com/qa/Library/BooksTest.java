package com.qa.Library;

import static org.junit.Assert.*; 
import org.junit.Test;

public class BooksTest {
	Books book = new Books(657383923, "The last lecture", "Randy Paul", "Penguin");
	Books book2 = new Books(63900923, "The last ", " Paul", "Penguin");
	Books book3 = new Books(657383923, "The ", "Randy Paul", "Penguin");
	Books book4 = new Books(657383923, "Hello there", "Randy Paul", "Penguin");
	Books book5 = new Books(657383923, "yes", "Randy Paul", "Penguin");
	
	
	
	@Test
	public void updateItemTest() {
		book.addToList(book);
		book2.addToList(book2);
		book3.addToList(book3);
		book4.addToList(book4);
		book5.addToList(book5);
		//assertEquals(false, book.updateItem(5));
		assertEquals(true, book3.updateItem(2));
		assertEquals(true, book3.updateItem("The", "The alchemist"));
		//assertEquals(false, book.updateItem("The last", "hello"));
	}
	
	

}
