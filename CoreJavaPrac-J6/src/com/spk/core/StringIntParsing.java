package com.spk.core;

public class StringIntParsing {
	
	public static void main(String[] args) {
		
		//String word = "testword"; //Does not work
		//String word = "12345.45"; //Does not work
		String word = "12345";
		
		int wordNumber = Integer.parseInt(word);
		
		System.out.println(wordNumber);
		
		
		int sourceNumber = 1233;
		String numberString = String.valueOf(sourceNumber);
		System.out.println(numberString);
	}

}
