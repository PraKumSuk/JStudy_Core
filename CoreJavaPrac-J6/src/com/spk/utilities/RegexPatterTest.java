package com.spk.utilities;

import java.util.regex.Pattern;

//Regular Expression
public class RegexPatterTest {
	
	//Note \d means digit 0-9
	// \D means non-digit char i.e anything apart from 0-9
	
	public static void main(String[] args) {
				
		//returns true if string contains non-digit
		Pattern pattern1 = Pattern.compile(".*\\D.*");
		System.out.println("NON DIGIT ? "+pattern1.matcher("fdjkdfkjfkdjdfkjd").matches());
		
		//returns true if string contains only digits
		Pattern pattern2 = Pattern.compile(".*[^0-9].*");
		System.out.println("DIGIT ? "+pattern2.matcher("1234").matches());
		
		//returns true if it has exact 6 digits	
		Pattern digitPattern1 = Pattern.compile("\\d\\d\\d\\d\\d\\d");
		//OR
		Pattern digitPattern2 = Pattern.compile("\\d{6}"); //{6} means number of times
		System.out.println("Exactly 6 digits ? "+digitPattern1.matcher("1234567").matches());
	}

}
