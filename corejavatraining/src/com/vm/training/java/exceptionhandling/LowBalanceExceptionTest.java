package com.vm.training.java.exceptionhandling;

public class LowBalanceExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  balance = 900;
		try {
			if(balance<1000) {
				throw new LowBalanceException("your balance is less than 1000rs");
			}
		}
	catch(LowBalanceException e) {
		e.printStackTrace();
		
	}
	
	}

}
