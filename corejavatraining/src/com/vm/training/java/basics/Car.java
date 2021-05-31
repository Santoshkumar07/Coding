package com.vm.training.java.basics;

 class CarModel{

	  private   int year;
		private  String make;
		private   int speed;
	 CarModel(int year, String make) {
			super();
			this.year = year;
			this.make = make;
		}
	int  accelerate(int  speed) {
		speed  =  speed  + 5;
		return  speed;
	}
	int  brake(int  speed) {
	speed  =  speed  - 5;
	return  speed;
}
 public static  class  Car{
public static void main(String[] args) {
	Car cm = new Car();
	
	}
		
	}
 }
