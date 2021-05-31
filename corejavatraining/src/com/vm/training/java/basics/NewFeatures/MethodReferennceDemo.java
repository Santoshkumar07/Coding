package com.vm.training.java.basics.NewFeatures;

interface Validate{
	void  validateLogin();
}
class Car{
	void  myLogin() {
		System.out.println("ur and password");
	}
}
class Bus{
	static void login()
	{
		System.out.println("this is my login");
	}
}
public class MethodReferennceDemo {
	public static void main(String[] args) {
		Validate v=()->System.out.println("login validation");
		v.validateLogin();
		Car c = new Car();
		Validate v1=c::myLogin;
		v1.validateLogin();
}
}
