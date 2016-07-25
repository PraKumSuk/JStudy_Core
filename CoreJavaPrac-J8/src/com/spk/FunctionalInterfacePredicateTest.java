package com.spk;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalInterfacePredicateTest {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		// Predicate<Integer> predicate = n -> true
		// n is passed as parameter to test method of Predicate interface
		// test method will always return true no matter what value n has.

		System.out.println("Print all numbers:");
		//pass n as parameter
		eval(list, n->true);


		System.out.println("Print even numbers:");
		// Predicate<Integer> predicate1 = n -> n%2 == 0
		// n is passed as parameter to test method of Predicate interface
		// test method will return true if n%2 comes to be zero
		eval(list, n-> n%2 == 0 );

		System.out.println("Print numbers greater than 3:");
		// Predicate<Integer> predicate2 = n -> n > 3
		// n is passed as parameter to test method of Predicate interface
		// test method will return true if n is greater than 3.
		eval(list, n-> n > 3 );
	}

	public static void eval(List<Integer> list, Predicate<Integer> predicate) {

		for(Integer n: list) {
			if(predicate.test(n)) {
				System.out.println(n + " ");
			}
		}
	}

}
