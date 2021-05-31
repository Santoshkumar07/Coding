package com.vm.training.java.basics.Date;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {

	public static void main(String[] args) {
		LocalDate today=LocalDate.now();
		LocalDate joiningDate = LocalDate.of(2021, 05,05);
		Period period = Period.between(today, joiningDate);
		System.out.println("year "+period.getYears()+ "month "+period.getMonths()+"day"+period.getDays());
		
	}

}
