package com.vm.training.java.exceptionhandling;

public class LowBalanceException extends Exception {

	String message;
	LowBalanceException(String message){
		this.message=message;	
	}
	public String toString() {
		return message;
	}

}
