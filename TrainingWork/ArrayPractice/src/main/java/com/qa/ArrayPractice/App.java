package com.qa.ArrayPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class App 
{
    public static void main( String[] args )
    {
    	List <Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5, 9, 8, 12);
    	//PrintAll(numbers);
    	//PrintEven(numbers);
    	//PrintTimesTen(numbers);
    	PrintHighest(numbers);
    	PrintLowest(numbers);
  //  PrintSquared(numbers);
    	PrintUnique(numbers);
    }
    
    //exercise 1
    public static void PrintAll(List<Integer> numbersArray) {
    	//with streams
    	numbersArray.stream().forEach(System.out::println);
    	
    	/* without streams
    	for (int x: numbersArray) {
    		System.out.println(x);
    	} */
    }
    
    //exercise 2
    public static void PrintEven(List<Integer> numbersArray) {
    	//with streams
    	numbersArray = numbersArray.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
    	numbersArray.stream().forEach(System.out::println);
    	
    	/* without stream 
    	for (int x = 0; x < numbersArray.size(); x++) {
    		if (numbersArray.get(x) % 2 == 0) {
    		System.out.println(numbersArray.get(x));
    		}
    	} **/
    }
    
  //exercise 3
    public static void PrintTimesTen(List<Integer> numbersArray) {
    	//with streams
    	numbersArray = numbersArray.stream().map(i -> i*10).collect(Collectors.toList());
    	numbersArray.stream().forEach(System.out::println); 
    	
    	/* without streams
    	for (int x = 0; x < numbersArray.size(); x++) {
    		System.out.println(numbersArray.get(x)*10);
    		
    	} */ 
    }
    
    //exercise 4
    public static void PrintHighest(List<Integer> numbersArray) {
    	//with streams
    	
    	System.out.println("Highest value is: " + numbersArray.stream().max(Comparator.comparing(Integer:: valueOf)).get()); 
    	
    	/* without streams
    	int highest = numbersArray.get(0);
    	for (int x = 0; x < numbersArray.size(); x++) {
    		if (numbersArray.get(x) > highest) {
    			highest = numbersArray.get(x);
    		}
    	}
    	System.out.println( "Highest number is: "+highest);
    	
    	*/ 
    }
    
    //exercise 5
    public static void PrintLowest(List<Integer> numbersArray) {
    	//with streams
    	System.out.println("Lowest value is: " + numbersArray.stream().min(Comparator.comparing(Integer:: valueOf)).get());
    
    	/* without streams
    	
    	int lowest = numbersArray.get(0);
    	for (int x = 0; x < numbersArray.size(); x++) {
    		if (numbersArray.get(x) < lowest) {
    			lowest = numbersArray.get(x);
    		}
    	}
    	System.out.println( "Lowest number is: "+lowest);
    	*/
    }
    
    //exercise 6
    public static void PrintSquared(List<Integer> numbersArray) {
    	//with streams
    	numbersArray = numbersArray.stream().map(i -> i*i).collect(Collectors.toList());
    	numbersArray.stream().forEach(System.out::println); 
    	
    	/*without streams
    	
    	List <Integer> squareArray = new ArrayList <Integer>();

    	for (int x = 0; x < numbersArray.size(); x++) {
    		squareArray.add(numbersArray.get(x)*numbersArray.get(x));
  
    		}
    	for (int x: squareArray) {
    		System.out.println(x);
    	}
    	
    	*/ 
    }
    
    //exercise 7
    public static void PrintUnique(List<Integer> numbersArray) {
    	//with streams
    	List <Integer> unique = numbersArray.stream().map(i -> i*i ).distinct().collect(Collectors.toList());
    	unique.stream().forEach(System.out::println); 
    	
    	
    	List <Integer> uniqueArray = new ArrayList <Integer>();
    	/*
    	for (int x = 0; x < numbersArray.size(); x++) {
    		uniqueArray.add(numbersArray.get(x)*numbersArray.get(x));
    		if (!(uniqueArray.contains(numbersArray.get(x)))) {
    			uniqueArray.add(numbersArray.get(x));
    		}
    	}
    	for (int x: uniqueArray) {
    		System.out.println(x);
    	}
    	*/
    	
    }
}
