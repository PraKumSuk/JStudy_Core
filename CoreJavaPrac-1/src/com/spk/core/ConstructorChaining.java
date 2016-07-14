package com.spk.core;

public class ConstructorChaining {

	public static void main(String args[]) {
		// testing constructor chaining in Java
		new Derived("Test"); 
	}

}

class Base{
	
	protected String name;
	
	public Base(){
        this(""); //calling one arg constructor of same class
        System.out.println("Inside no argument constructor of Base class");
    }

	public Base(String name){
		this.name = name; //calling this class constructor
		System.out.println("One arg constructor of Base class");
	}
}

class Derived extends Base{
	
	protected String name;
	
	public Derived(){
	       System.err.println("Inside no argument constructor of Derived class");
	   }

	public Derived(String name){
		super(name); //calling one argument constructor of super class
		System.out.println("Inside one arg constructor from Derived class");
	}
}

	