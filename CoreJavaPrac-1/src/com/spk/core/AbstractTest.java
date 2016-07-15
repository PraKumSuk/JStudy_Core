package com.spk.core;

import java.io.Serializable;

//ABSTRACT CLASS CANNOT BE INSTANTIATED

//NOTE ABSTRACT CLASS CANNOT EXTEND ANY CLASS
//IT CAN ONLY IMPLEMENT OTHE CLASS
public abstract class AbstractTest{

	//Can have a constructor
	AbstractTest(){
		System.out.println();
	}

	//Can have a abstract method i.e. without body
	abstract void method1();

	//Can have a concrete method
	void method2(){
		System.out.println();
	}
	
	//Abstract Class cannot have instance, but since below 
	//is static method jvm access below method with the name of Class
	public static void main(String[] args) {
		System.out.println("Hi Abstract");
	}
	
	//Nested abstract Inner class is allowed
	abstract class NestedAbstractTest{
		
		NestedAbstractTest(){
			System.out.println("Nested Abstract, rock on");
		}
		
	}
}
