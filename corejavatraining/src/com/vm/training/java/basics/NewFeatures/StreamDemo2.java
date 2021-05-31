package com.vm.training.java.basics.NewFeatures;

import java.util.ArrayList;

public class StreamDemo2 {

	public static void main(String[] args) {
		ArrayList<Employee> emp= new ArrayList<Employee>();
		emp.add(new Employee(1,"santosh","mr",100000,25));
		emp.add(new Employee(2,"kumar","hr",5000,24));
		emp.add(new Employee(3,"sri","lead",40000,26));
		emp.forEach(System.out::println);
		System.out.println("====count of employees===");
		long empcount = emp.stream().count();
		System.out.println("total employees"+empcount);
		emp.stream().filter(s->s.getDept().equalsIgnoreCase("sri")).forEach(System.out::println);
		emp.stream().filter(s->s.getDept().equals("hr")).forEach(s->System.out.println(s));
		emp.stream().filter(s1->s1.getName().startsWith("a")).forEach(s->System.out.println(s));
		long empcountofsalary=emp.stream().filter(s2->s2.getSalary()>5000).count();
		emp.stream().map(m->m.getSalary()*0.20+m.getSalary()+"  "+m.getName()+" "+m.getName().length()).forEach(System.out::println);

	}

}
