package com.vm.training.java.basics.Date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateFormatterDemo {

	public static void main(String[] args) {
		System.out.println(LocalDate.now());
		LocalDate today = LocalDate.now();
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("YYYY/MM/DD");
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("YYYY MM DD");
		
		DateTimeFormatter full = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		DateTimeFormatter medium = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter Short = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		
		String afterFormat = today.format(dtf1);
		System.out.println("date  after format"+ afterFormat);
		
		String afterFormat2 = today.format(dtf2);
		System.out.println("date  after format"+ afterFormat2);
		
		
		String fulldate = today.format(dtf2);
		System.out.println("date  after format"+ full);
		String mediumdate = today.format(dtf2);
		System.out.println("date  after format"+ medium);
		String shortdate = today.format(dtf2);
		System.out.println("date  after format"+ Short);
								
					
					
		
		
		
		
		
		
		
	}

}
