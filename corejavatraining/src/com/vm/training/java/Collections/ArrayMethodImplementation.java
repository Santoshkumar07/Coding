package com.vm.training.java.Collections;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayMethodImplementation {
	static boolean  search(ArrayList arr,Integer key) {
		return arr.contains(key);		
	}
	
	public static void main(String[] args)
	{

	ArrayList<Integer> arr = new ArrayList<Integer>();
	 arr.add(400);
     arr.add(2);
     arr.add(300);
     arr.add(10);
     Collections.sort(arr);
     System.out.println(arr);
}
}
