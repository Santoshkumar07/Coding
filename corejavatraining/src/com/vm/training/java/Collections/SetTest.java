package com.vm.training.java.Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

class Employee{
	int id;
	String name;
	String dept;
public	Employee(int id,String name,String dept){
	this.id=id;
	this.name=name;
	this.dept=dept;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDept() {
	return dept;
}

public void setDept(String dept) {
	this.dept = dept;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + "]";
}

public class EmployeeDetails extends Employee{
	String pancard;
	String address;
	public EmployeeDetails(int id, String name, String dept,String pancard,String address) {
		super(id, name, dept);
		this.pancard=pancard;
		this.address=address;	
	}
	@Override
	public String toString() {
		return "EmployeeDetails [pancard=" + pancard + ", address=" + address + "]";
	}
	
}	
}
public class SetTest {

	public static void main(String[] args) {
		/*HashSet<Employee> set=new HashSet<Employee>(); 
		 Employee e1 =  new Employee(1550,"kumar","It");
		 Employee e2 =  new Employee(1450,"santosh","It");
		set.add(e1);
		set.add(e2);
		System.out.println(set);*/
		 ArrayList<String> al=new ArrayList<>(); 
		 al.add("abc");
		 al.add("VAM");
		 al.add("pam");
		 /*ArrayList<Integer> al1=new ArrayList<>(); 
		 al1.add(14);
		 String s = (String)al.get(0);
		 System.out.println(s);
		 System.out.println(al1);*/
		 Iterator i=al.iterator();  
         while(i.hasNext())  
         {  
             System.out.println(i.next());  
         }  
         for(String b:al){  
        	    System.out.println(al);  
        	    }  
		 
		
	}

}

