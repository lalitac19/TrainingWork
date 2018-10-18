package com.qa.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {

	public static void main(String[] args) {
		Person p1 = new Person ("Barry", 76, "Mechanic");
		Person p2 = new Person ("Lilly", 34, "Software Developer"); 
		Person p3 = new Person ("Bob", 21, "Financial Analyst");
		Person p4 = new Person ("Tom", 26, "Teacher");
		Person p5 = new Person("Adam", 40, "Engineer");
		
		ArrayList <Person> personsList = new ArrayList<>();
		
		personsList.add(p1);
		personsList.add(p2); 
		personsList.add(p3);
		personsList.add(p4);
		personsList.add(p5);
		
		//personsList.stream().forEach(e->e.DisplayDetails());
		
		Search("Tom", personsList);
		
		
	}
	
	public static void Search(String name, ArrayList <Person> lists) {
		//System.out.println(name);
		List<Person> value = new ArrayList <>(); 
		value = lists.stream().filter(e -> e.getName().equals(name)).collect(Collectors.toList());
		value.stream().forEach(e->e.DisplayDetails());
	} 

}
