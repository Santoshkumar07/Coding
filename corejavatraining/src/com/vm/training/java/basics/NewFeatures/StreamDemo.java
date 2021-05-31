package com.vm.training.java.basics.NewFeatures;

import java.util.ArrayList;

public class StreamDemo {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(2);
		nums.add(5);
		nums.add(6);
		nums.add(12);
		System.out.println("numbers is"+nums);
		nums.forEach(s->System.out.println(s));
		long count=nums.stream().count();
		System.out.println("total numbers is"+count);
		System.out.println("numbers greater than 2");
		nums.stream().filter(s->s>2).forEach(s->System.out.println(s));
		
	}

}
