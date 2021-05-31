package com.vm.training.java.threadCommunication;

public class InterThreadCommunication {

	public static void main(String[] args) {
		Customer customer =  new Customer();
		Thread t1 = new Thread()
		{
			public void run() {
				System.out.println("customer.withdraw(5000)");
			}
		};
		Thread t2 = new Thread()
		{
			public void run() 
			{
				System.out.println("customer.depsoit(5000)");
			}
		};
		t1.setName("withdraw");
		t1.setName("despoit");
		t1.start();
		t2.start();
	}

}
