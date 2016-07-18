package com.spk.core;

//Public Main Class cannot be static making below line static gives CE
public class NestedStatic {

	public static void main(String args[]){
		NestedStatic.NestedStaticClass ns = new NestedStatic.NestedStaticClass();
		System.out.println(ns.getDescription());
	}

	//Class inside a class i.e. called Nested Static Class
	static class NestedStaticClass{
		public String NestedStaticDescription =" Example of Nested Static Class in Java";

		public String getDescription(){
			return NestedStaticDescription;
		}
	}

	//This is called Nested/Inner Class
	class NestedClass{
		public String NestedStaticDescription =" Example of Nested Static Class in Java";

		public String getDescription(){
			return NestedStaticDescription;
		}
	}	
	
}

	//This is called Nested/Inner Class
	class NestedClass{
		public String NestedStaticDescription =" Example of Nested Static Class in Java";
	
		public String getDescription(){
			return NestedStaticDescription;
		}
	}
	
	
	
	//Note both the classes have same name but still no CE
	//as its valid i.e. seperate by their SCOPES
