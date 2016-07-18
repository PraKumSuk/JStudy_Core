package com.spk.nio;

import java.util.Scanner;

public class KeyboardScannerTest {
	
	public static void main(String[] args) {
		
		Scanner inputScanner = new Scanner(System.in);
		
		//Accepting String from System Input
		System.out.println("Enter a input");
		String input = inputScanner.nextLine();
		
		System.out.println("The value you entered is "+input);
		
		//Accepting integer from System Input
		System.out.println("Now enter a number");
		int number = inputScanner.nextInt();
		
		System.out.println("The number you entered is "+number);
		
		//Note : java.util.InputMismatchException will be thrown if 
		//if invalud arguments are passed from System In i.e. keyboard
	}

}
