package com.vm.training.java.oops;

public class Car implements IVehicle {
	String model;
	Car(String model){
		this.model=model;
	}
	protected int g;
	@Override
	public void steering() {
		System.out.println("Power  Streeing");
		
	}

	@Override
	public void brakes() {
		System.out.println("disk breaks");
		
	}

	@Override
	public void accelarator() {
		System.out.println("no idea");
		
	}

	@Override
	public void clutches() {
		System.out.println("based on gears");
	}

	@Override
	public int gears() {
		
		return 5;
	}
	
	

}
