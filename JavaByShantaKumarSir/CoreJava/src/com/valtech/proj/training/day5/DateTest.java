package com.valtech.proj.training.day5;

/*
@@Author: Irfan Ahmad


*/
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateTest {
	DateFormat df=new SimpleDateFormat("dd-MM-YY");
	Date date=new Date();
	@Test
	public void testDate() {
		Date date=new Date();
		System.out.println(date);
		/*
		 * HH-Hour
		 * mm-minute
		 * ss-second
		 * SS-milli seconds
		 * YY/YYYY-year
		 * MM/MMM-Month
		 * DD-number of day
		 * dd-day
		 */
		DateFormat df=new SimpleDateFormat("dd-MM-YY HH:mm:ss:SS");
		System.out.println(df.format(date));
	}
	@Test
	public void testDateOldWay() {
		Date date=new Date(47,7,15);
		System.out.println(date);
		System.out.println(df.format(date));
	}
	
	@Test
	public void testDateWithCal() {
		Calendar cal=Calendar.getInstance();
		cal.set(Calendar.YEAR,1947);
		cal.set(Calendar.MONTH,Calendar.AUGUST);
		cal.set(Calendar.DATE,15);
		System.out.println(date);
		System.out.println(df.format(date));
	}
	@Test
	public void testDateFromString() throws Exception {
		DateFormat df=new SimpleDateFormat("dd-MM-yyyy");
		Date date=df.parse("15-08-1947");
		System.out.println(date);
	}
	
}
