package com.vm.training.java.oops;

public class TestAssociation {
	public static void main(String[] args) {
		showAggregation();
		//showComposition();
	}

	static void showAggregation() {
		Address address =  new Address();
		address.setCity("tenali");
		address.setState("ap");
		address.setCountry("india");
		
		Emp emp =new Emp();
		emp.setId(100);
		emp.setFirstName("santosh");
		emp.setLastName("kumar");
		//emp.setAddress(address);
		
		System.out.println(emp);
		
		System.out.println("------------------");
		emp=null;
		
		System.out.println(emp);
		System.out.println(address);
	}
	
	static void showComposition() {
		
	}
	
	
}
