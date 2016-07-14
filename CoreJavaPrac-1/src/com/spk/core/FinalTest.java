package com.spk.core;

import java.util.ArrayList;
import java.util.List;

public class FinalTest {
	
	
	private final String LOAN = "loan";
	
	final List l1oans = new ArrayList();
	
	//below gives compile error
	//LOAN= "money"
	
	//Note Final variables/objs should be initialised using constructor /class load time
	//Trying to do so later will give CE i.e. Compile Error
	
	//final variables are constants and hence always written in CAPS
	private final int COUNT=10;	
	
	public static void main(String[] args) {
		
		final List loans = new ArrayList();
		loans.add("credit card loan"); //valid
		loans.add("personal loan"); //valid
		
		//loans = new Vector();  //not valid CE
		
		loans.remove(0);
		System.out.println(loans.get(0));
		
		FinalTest ft = new FinalTest();
		ft.l1oans.add("were");

	}	
}
