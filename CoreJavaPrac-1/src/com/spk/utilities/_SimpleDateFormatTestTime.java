package com.spk.utilities;


import java.text.SimpleDateFormat;
import java.util.Date;

//_ has been used in class name for research purpose
public class _SimpleDateFormatTestTime {

	public static void main(String[] args) {
		// This is how to get today's date in Java
		Date today = new Date();
		System.out.println("Today is : " + today);

		SimpleDateFormat DATE_FORMAT;
		String date;

		//formatting Date with time information
		DATE_FORMAT = new SimpleDateFormat("dd-MM-yy:HH:mm:SS");
		date = DATE_FORMAT.format(today);
		System.out.println("Today in dd-MM-yy:HH:mm:SS : " + date);

		//Note Z-timezone
		//SimpleDateFormat example - Date with timezone information
		DATE_FORMAT = new SimpleDateFormat("dd-MM-yy:HH:mm:SS Z");
		date = DATE_FORMAT.format(today);
		System.out.println("Today in dd-MM-yy:HH:mm:SSZ : " + date);
	}

}
