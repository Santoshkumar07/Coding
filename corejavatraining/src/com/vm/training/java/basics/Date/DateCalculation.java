package com.vm.training.java.basics.Date;

import java.time.LocalDate;

public class DateCalculation {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println("today ="+today);
		System.out.println("next day ="+today.plusDays(1));
		System.out.println("after two  weeks ="+today.plusWeeks(2));
		System.out.println("next month ="+today.plusMonths(1));
		System.out.println("next year ="+today.plusYears(1));
		
		LocalDate bookingDate =  LocalDate.of(2021,05,30);
		if(bookingDate.isAfter(today)) {
			System.out.println("current date u can book");			
		}
		else {
			System.out.println("data of booking can't be previous");
			
		}
		
		
	}

}
