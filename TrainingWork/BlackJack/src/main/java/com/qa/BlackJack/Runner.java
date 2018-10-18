package com.qa.BlackJack;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int blackJack(int num1, int num2) {
		ArrayList <Integer> cards = new ArrayList< Integer>(); 
		cards.add(num1);
		cards.add(num2);
		
		cards = cards.stream().max(Comparator.comparing(Integer:: valueOf)).get()); 
		
		System.out.println("Highest value is: " );
		
		//return ;
	}

}
