package com.spk.coll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionSortingAscDesc {
	
	public static void main(String[] args) {
		
		/*System.out.println(" *************** ARRAY EXAMPLE ********************");
		List<Integer> list = Arrays.asList( 11, 0, 1, 2, 5, 9, 3, 6, 4, 7, 8);		
		System.out.println("Unsorted List : " + list);
		
		Collections.sort(list);
		System.out.println("Default Sorted List i.e. in Asc : " + list);
		
		Collections.sort(list, Collections.reverseOrder()); //Collections.reverseOrder() returns a comparator
		System.out.println("Sorting in Desc Order using a default Comparator : " + list);*/
		
		System.out.println(" *************** ARRAYLIST EXAMPLE ********************");
		ArrayList alphabets = new ArrayList(); 
        alphabets.add("c"); 
        alphabets.add("b"); 
        alphabets.add("a"); 
        alphabets.add("d");
        System.out.println("Unsorted ArrayList : " + alphabets);
        
        Collections.sort(alphabets);
        System.out.println("Default Sorted ArrayList i.e. in Asc : " + alphabets);
        
        Collections.sort(alphabets, Collections.reverseOrder());
        System.out.println("Sorting in Desc Order using a default Comparator : " + alphabets);

        


		
	}

}
