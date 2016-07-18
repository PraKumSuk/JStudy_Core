package com.spk.coll;

import java.util.ArrayList;
import java.util.Iterator;

public class InteratorVsObjRemoval {
	
	public static void main(String[] args) {
		
		ArrayList<String> stockExchange = new ArrayList<String>();
		stockExchange.add("NSE");
		stockExchange.add("BSE");
		stockExchange.add("NYE");
		stockExchange.add("UKE");
		
		//Once iterator has acquired a lock on the
		//stockExchange object
		//you CANNOT use object.remove method
		//see below
		Iterator<String> itr = stockExchange.iterator();
		while (itr.hasNext()){
			System.out.println(itr.next());
			//stockExchange.remove(0); // object's remove method leads to CME
			itr.remove(); // object's remove method leads to CME
		}
		
	}

}
