package com.spk.core;

public class StaticTest {
	
	static {
        System.out.println("Executed when Class is Loaded i.e. Even Before Main");
        
        //Creating an exception in static, does not even invoke main method
        int a = 4;
        int b = 0;
        System.out.println(a/b);
    }

	String description = "electronic trading system";
	  
    public static void main(String[] args) {
    	System.out.println("Main starts now........");
    	
        //cannot make a static reference to the non-static
    	//description = "commodity trading system"; 

    }

}
