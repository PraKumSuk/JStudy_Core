package com.spk.strng;

public class StringTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "GOD";
	
		
		String s2 = new String("GOD"); //Created only in HEAP
		
		if(s1.equals(s2)) {
			  //This condition true because same content.
			
			System.out.println("ddd");
			}

			if(s1 == s2) {
				
				System.out.println("hmmm");
			}
			 
		

	}

}
