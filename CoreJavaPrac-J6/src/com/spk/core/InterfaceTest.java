package com.spk.core;

import java.io.Serializable;

//An interface can extend any number of interfaces 
//BUT a class can extend ONLY 1 INTERFACE

//abstract here does not matter
public abstract interface InterfaceTest extends Serializable, Cloneable, Runnable{
	
	public String sample="test";
	
	public void method1();
	
	abstract void method2();

	//NOTE : All methods declared inside Java Interfaces are implicitly public and abstract,

}
