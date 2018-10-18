package com.qa.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App 
{
    public static void main( String[] args )
    {
       // List <Integer> numbers = new ArrayList <>(); 
           // StreamArray(numbers); 
    	
    	//System.out.println( "Hello World!" );
    }
    
    public static void StreamArray() {
    	//with streams
    	
    	//Stream <Long> OnetoHundred = Stream.iterate(10L,n->n + 1).limit(10).forEach(System.out::println);
    			
    	//numbersArray = numbersArray.stream().map( i -> i+1).distinct().collect(Collectors.toList());
    	
    //	numbersArray.stream().forEach(System.out::println);
    	
    	/* without streams
    	for (int x: numbersArray) {
    		System.out.println(x);
    	} */
    }
}
