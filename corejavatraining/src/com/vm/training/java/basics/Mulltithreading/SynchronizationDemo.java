package com.vm.training.java.basics.Mulltithreading;

class Bottle{
public void drink(int  time) {
	for(int i=1;i<=time;i++)
	{
		System.out.println(Thread.currentThread().getName()+" is drinking " + i);
	}
		
	}
}



class  DrinkWater implements Runnable
{
	Bottle bottle  = new Bottle();
	public void run() {
		 bottle.drink(6);
	}
}
public class SynchronizationDemo {

	public static void main(String[] args) {
		DrinkWater dw= new DrinkWater();
		Thread teja = new Thread(dw);
		Thread santosh = new Thread(dw);
		teja.setName("teja");
		santosh.setName("santosh");
		teja.start();
		santosh.start();
	}

}
