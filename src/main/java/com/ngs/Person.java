package com.ngs;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Person {

	private int id;
	private String name;
	
	
	public Person() {
		System.out.println("Object created!");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String show() {
		System.out.println("Inside show method");
		return "Inside show method";
	}
	
}
