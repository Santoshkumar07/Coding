package com.vm.training.java.basics.NewFeatures;


interface Test{
	void dispaly();	
}

public class LamdaExpression {

	public static void main(String[] args) {
		Test t = ()->
		{
			System.out.println("hello");
			System.out.println("java");
		};
		t.dispaly();
		
		Test t1=()->System.out.println("hello single line body");
		t1.dispaly();
	}

}
