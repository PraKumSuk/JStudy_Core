package com.spk.utilities;

import java.util.HashSet;
import java.util.Iterator;

public class DuplicateWords {
	
	public static void main(String[] args) {
		String source = "This is the last time he is going to pay you. you are the man";
		
		String []sourceArray = source.split(" ");
		HashSet<String> tempSet = new HashSet<String>();
		
		for (int i=0; i<sourceArray.length; i++){
			boolean alreadyExists=tempSet.add(sourceArray[i]);
			if (alreadyExists == false)System.out.println(sourceArray[i]+" is Duplicate");			
		}		
	}

}
