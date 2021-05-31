package com.vm.training.java.basics.NewFeatures;

interface Bank{
	default void openAccount() {
		System.out.println("You can  open account  online");
	}
	static void holiday() {
		System.out.println("enjoy holiday");

	}
	abstract int rateOfInterest(int interest);
	abstract int minBalance(int amount);
}
class  Axis   implements   Bank{
	
	public  int rateOfInterest(int interest)
	{
		return interest;
	}
	public int minBalance(int amount) {
		return  amount;
	}
}

public class NewInterfaceDemo {

	public static void main(String[] args) {
		Bank bank  =new Axis();
		bank.openAccount();
		Bank.holiday();
		System.out.println("minimum balance :"+ bank.minBalance(1000));
		System.out.println("minimum balance :"+ bank.rateOfInterest(4));


	}

}
