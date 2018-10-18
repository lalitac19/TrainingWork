package com.qa.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
	
	private String name;
	private int age; 
	private String jobTitle; 
	
	public Person(String name, int age, String jobT) {
		this.setAge(age);
		this.setName(name);
		this.setJobTitle(jobT);
	}
	
	
	public String ToString() {
		return this.getName() + " is " + this.getAge() + " years old and works as a " + this.getJobTitle();
	}
	
	public String getName() {
		return this.name; 
	}
	public String getAge() {
		return Integer.toString(this.age); 
	}
	public String getJobTitle() {
		return this.jobTitle; 
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	public void DisplayDetails() {
		System.out.println(this.ToString());
	}

}
