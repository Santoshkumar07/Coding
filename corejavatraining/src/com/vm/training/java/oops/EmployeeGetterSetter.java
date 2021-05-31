package com.vm.training.java.oops;

public class EmployeeGetterSetter {
public static void main(String[] args) {
		
		Employee employee = new Employee();
		EmployeeDetails empDetails = new EmployeeDetails();
		employee.setEmpid(5878);
		employee.setName("kumar");
		employee.setDept("IT");
		empDetails.setMobile("9987455632");
		empDetails.setEmail_ID("abc@gmail.com");
		empDetails.setAddress("abc");
         		
		System.out.println(employee.getEmpid());
		System.out.println(employee.getName());
		System.out.println(employee.getDept());
		System.out.println(empDetails.getMobile());
		System.out.println(empDetails.getEmail_ID());
		System.out.println(empDetails.getAddress());
		
	}


}
