package com.vm.training.java.oops;

public class TestOverriding {
	public static void main(String[] args) {
		Son son= new Son(70,50,20);
		son.walk();
		
		Grandfather father= new Son(70,50,20);
		father.walk();

}
}
