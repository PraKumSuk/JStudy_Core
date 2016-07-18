package com.spk.utilities;

import java.util.Date;
//import java.sql.Date;

public class DateTest {
	
	public static void main(String[] args) {
		java.util.Date utilDate = new java.util.Date();
		System.out.println(utilDate);
		
		java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
		System.out.println(sqlDate);
	}

}
