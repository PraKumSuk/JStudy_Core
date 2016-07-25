package com.spk;

public class LambdaExpressionTest2 {

	public static void main(String[] args) {

		LambdaExpressionTest2 tester = new LambdaExpressionTest2();

		//with parenthesis
		GreetingService greetService1 = message -> System.out.println("Hello " + message);
		greetService1.sayMessage("Mahesh");

		//without parenthesis
		GreetingService greetService2 = (message) -> System.out.println("Hello " + message);		
		greetService2.sayMessage("Suresh");

	}

	interface GreetingService {
		void sayMessage(String message);
	}
}
