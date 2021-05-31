package com.vm.training.java.Concurrency;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> obj =new  ArrayList<Integer>();
		obj.add(1);
		obj.add(10);
		obj.add(40);
		for(Integer i : obj) {
			System.out.println(i);
			obj.add(200);
			
		}
		
		}

}
