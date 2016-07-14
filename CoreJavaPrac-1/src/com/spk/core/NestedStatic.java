package com.spk.core;

//Public Main Class cannot be static making below line static gives CE
public class NestedStatic {
	
	public static void main(String args[]){
		NestedStatic.NestedStaticClass ns = new NestedStatic.NestedStaticClass();
        System.out.println(ns.getDescription());
    }
	
	//Class inside a class i.e. Nested Class
	static class NestedStaticClass{
        public String NestedStaticDescription =" Example of Nested Static Class in Java";
      
        public String getDescription(){
            return NestedStaticDescription;
        }
    }

}
