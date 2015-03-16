package com.trn.web;

public class HelloWorld {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void printHello(){
		System.out.println("Hello "+getName());
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void printThrowException(){
		System.out.println("Exception raised");
		throw new IllegalArgumentException();
	}

}
