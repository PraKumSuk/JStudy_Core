package com.spk.utilities;

import java.util.Scanner;

public class KeyboardInputScanner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("What is your name");
		
		Scanner keyboardScanner = new Scanner(System.in);		
		String temp = keyboardScanner.nextLine();
		
		System.out.println(temp);
		
		

	}

}
