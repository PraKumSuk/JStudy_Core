package com.spk.coll;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTester {
	public static void main(String[] args) {
		HashSet<String> supportedCurrencies = new HashSet<String>();
		
		supportedCurrencies.add("USD");
		supportedCurrencies.add("EUR");
		supportedCurrencies.add("JPY");
		supportedCurrencies.add("GBP");
		supportedCurrencies.add("INR");
		supportedCurrencies.add("CAD");
		supportedCurrencies.add("USD");

		Iterator<String> itr = supportedCurrencies.iterator();
		while(itr.hasNext()){
	         System.out.println(itr.next());
	    }		
	}
}
