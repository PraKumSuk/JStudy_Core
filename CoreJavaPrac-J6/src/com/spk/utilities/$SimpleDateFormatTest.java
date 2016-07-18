package com.spk.utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

//$ has been used in class name for research purpose
public class $SimpleDateFormatTest {

	public static void main(String[] args) {

		//Creating Date in java with today's date.
		Date dateNow = new Date();		
		System.out.println(dateNow);

		//Note d-date D-Day m-minute M-month
		//SimpleDateFormat is not ThreadSafe

		//change date into string yyyyMMdd format example "20110914"
		SimpleDateFormat dateformatyyyyMMdd = new SimpleDateFormat("yyyyMMdd");
		String date_to_string = dateformatyyyyMMdd.format(dateNow);
		System.out.println("date into yyyyMMdd format: " + date_to_string);

		//converting  date into ddMMyyyy format example "14092011"
		SimpleDateFormat dateformatddMMyyyy = new SimpleDateFormat("ddMMyyyy");
		date_to_string = dateformatddMMyyyy.format(dateNow);
		System.out.println("Today's date into ddMMyyyy format: " + date_to_string);

		//change date to string on dd-MM-yyyy format e.g. "14-09-2011"
		SimpleDateFormat dateformatJava = new SimpleDateFormat("dd-MM-yyyy");
		date_to_string = dateformatJava.format(dateNow);
		System.out.println("Today's date into dd-MM-yyyy format: " + date_to_string);

		//converting date to string dd/MM/yyyy format for example "14/09/2011"
		SimpleDateFormat formatDateJava = new SimpleDateFormat("dd/MM/yyyy");
		date_to_string = formatDateJava.format(dateNow);
		System.out.println("Today's date into dd/MM/yyyy format: " + date_to_string);

		//date to dd-MMM-yy format e.g. "14-Sep-11"
		SimpleDateFormat ddMMMyyFormat = new SimpleDateFormat("dd-MMM-yy");
		date_to_string = ddMMMyyFormat.format(dateNow);
		System.out.println("Today's date into dd-MMM-yy format: " + date_to_string);

		//convert date to dd-MMMM-yy format e.g. "14-September-11"
		SimpleDateFormat ddMMMMyyFormat = new SimpleDateFormat("dd-MMMM-yy");
		date_to_string = ddMMMMyyFormat.format(dateNow);
		System.out.println("date into dd-MMMM-yy format: " + date_to_string);

		/*
		 * 	G   Era designator       Text               AD
			y   Year                 Year               1996; 96
			M   Month in year        Month              July; Jul; 07
			w   Week in year         Number             27
			W   Week in month        Number             2
			D   Day in year          Number             189
			d   Day in month         Number             10
			F   Day of week in month Number             2
			E   Day in week          Text               Tuesday; Tue
			u   Day number of week   Number             1
			a   Am/pm marker         Text               PM
			H   Hour in day (0-23)   Number             0
			k   Hour in day (1-24)   Number             24
			K   Hour in am/pm (0-11) Number             0
			h   Hour in am/pm (1-12) Number             12
			m   Minute in hour       Number             30
			s   Second in minute     Number             55
			S   Millisecond          Number             978
			z   Time zone            General time zone  Pacific Standard Time; PST; GMT-08:00
			Z   Time zone            RFC 822 time zone  -0800
			X   Time zone            ISO 8601 time zone -08; -0800; -08:00
		 */
	}
}
