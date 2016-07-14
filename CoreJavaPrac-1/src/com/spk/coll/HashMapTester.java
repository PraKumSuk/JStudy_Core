package com.spk.coll;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class HashMapTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // create map
        Map<String,String> map = new HashMap<String,String>();
        
        // populate the map
        map.put("1","ALIVE");
        map.put("2","IS");
        map.put("3","AWESOME");
        map.put(null, null);
        map.put(null, "MIRACLE");
        map.put(null, "GODD");
        map.put(null, null);
        
        // create a synchronized map
        Map<String,String> syncMap = Collections.synchronizedMap(map);
        
        System.out.println(map.get("3"));
        
        System.out.println(syncMap);
        
        for (int i=0;i<1000000000;i++)
        	System.out.println(i + "Praveen Going on.......");

	}

}
