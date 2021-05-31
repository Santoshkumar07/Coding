package com.vm.training.java.basics.Date;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DateOfBirth {

	public static void main(String[] args) {
		LocalDate today=LocalDate.now();
		LocalDate bornDate=LocalDate.of(1999,06, 07);
		Period period=Period.between(bornDate,today);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Bday");
		String str=sc.nextLine();
		LocalDate borndate=LocalDate.parse(str);
		Period period1=Period.between( borndate,today);
		System.out.println("Year :"+period1.getYears()+" "+"Months :"+period1.getMonths()+" "+" Days :"+period1.getDays());
	}

}
