package com.spk.core;

public class InnerClassTest {

	public static void main(String[] args) {

		//Anonymous inner classfor implementing thread
		Thread anonymous = new Thread(){
			@Override
			public void run(){
				System.out.println("Anonymous class example in java");
			}
		};
		anonymous.start();


		//local inner class i.e. inside method
		class Local {
			public void name() {
				System.out.println("Example of Local class in Java");

			}
		}
		//creating instance of local inner class
		Local local = new Local();
		local.name();

		//Creating instance of inner class
		InnerClassTest test = new InnerClassTest();
		InnerClassTest.Inner inner = test.new Inner();
		inner.name(); //calling method of inner class
	}

	//Inner Class i.e. at class level
	private class Inner{
		public void name(){
			System.out.println("Inner class example in java");
		}
	}
}
