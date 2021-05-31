package com.vm.training.java.basics.Mulltithreading;


class Account{
	 public void balance(int time) {
		 synchronized(this) {
	for(int i=1;i<=time;i++)
	{
		System.out.println(Thread.currentThread().getName()+" is updating ");
	}
		
	}
}
}


class  Transcation implements Runnable
{
	Account  account  = new Account();
	public void run() {
		 account.balance(4);
	}
}

public class SynchronizationExample {

	public static void main(String[] args) {
		Transcation  tr =new Transcation();
		Thread deposit = new Thread(tr);
		Thread withdraw = new Thread(tr);
		deposit.setName("deposit");
		withdraw.setName("withdraw");
		deposit.start();
		withdraw.start();
	}

}

