package com.vm.training.java.basics.Date;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateDemo1 {

	public static void main(String[] args) {
		LocalDate todayDate=LocalDate.now();
		System.out.println("date="+todayDate);
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println("date adn time "+datetime);
		System.out.println("day of the year"+todayDate.getDayOfYear());
		System.out.println("month of the day"+todayDate.getDayOfMonth());
		System.out.println("week of the day"+todayDate.getDayOfWeek());
		
		
	}

}
