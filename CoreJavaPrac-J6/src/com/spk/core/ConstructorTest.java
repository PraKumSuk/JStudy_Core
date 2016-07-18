package com.spk.core;

public class ConstructorTest {

	private String loanType;

	public ConstructorTest(){
		System.out.println("Calling overloaded Constructor in Java");
		//this("");  //Constructor call must be 1st line throw CE
	}
	
	public ConstructorTest(String type){
		  this.loanType= type;
	}
	
}
