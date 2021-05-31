package com.vm.training.java.oops;

public class Bus implements IVehicle{

	@Override
	public void steering() {
		// TODO Auto-generated method stub
		System.out.println("Power  Streeing");
	}

	@Override
	public void brakes() {
		// TODO Auto-generated method stub
		System.out.println("Power  Streeing");
	}

	@Override
	public void accelarator() {
		// TODO Auto-generated method stub
		System.out.println("Based  on weight");
	}

	@Override
	public void clutches() {
		// TODO Auto-generated method stub
		System.out.println("Based  on gears");
		
	}

	@Override
	public int gears() {
		// TODO Auto-generated method stub
		return 6;
	}

}
