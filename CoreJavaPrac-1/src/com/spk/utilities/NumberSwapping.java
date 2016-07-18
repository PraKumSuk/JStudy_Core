package com.spk.utilities;

public class NumberSwapping {
	
	public static void main(String[] args) {
		
		int a = Integer.MAX_VALUE;
		int b = 10;
		
		/* This logic is used in below, but this leads to
		 * integer overflow when used in seperate staments
		 * so below logic when done in a single statement
		 * adds and subtracts using internal temp registers
		 * so there is no overflow
		 * a = a+b;
		 * b = a-b;
		 * a = a-b; 
		 * 
		 */
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		a = (a + b) - (b = a);

		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		//Now using XOR operation - BEST
		/* same = 0 different 1
		 * 0 0 - 0
		 * 0 1 - 1
		 * 1 0 - 1
		 * 1 1 - 0
		 */
		int x = Integer.MAX_VALUE;
		int y = 10;
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		x=x^y;
		y=x^y;
		x=x^y;
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}
}
