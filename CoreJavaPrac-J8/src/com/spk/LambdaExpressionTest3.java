package com.spk;

public class LambdaExpressionTest3 {

	final static String salutation = " Hellooooooooooo! ";

	public static void main(String[] args) {

		//Implementation
		GreetingService greetingService = (message) -> {System.out.println(salutation+message);};
		greetingService.sayMessage("Lambda Expressions");
		
		//Another Implementation
		GreetingService greetingService2 = (message) -> {System.out.println(salutation+message+salutation);};
		greetingService2.sayMessage("Lambda Expressions");
	}

	interface GreetingService {
		void sayMessage(String message);
	}
}
