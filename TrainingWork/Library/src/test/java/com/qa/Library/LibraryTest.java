package com.qa.Library;

import static org.junit.Assert.*; 
import org.junit.Test;

public class LibraryTest {
	
	
	Books book = new Books(657383923, "The last lecture", "Randy Paul", "Penguin");
	
	@Test
	public void addToListTest() {
		
		//assertEquals(1, book.addToList(book));
	}

	@Test
	public void removeItem () {
		assertEquals(0, book.removeItem(book));
	}
	
	
	
}
