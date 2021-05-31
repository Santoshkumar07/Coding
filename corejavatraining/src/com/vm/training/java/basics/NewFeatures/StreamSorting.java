package com.vm.training.java.basics.NewFeatures;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class StreamSorting {
	public static void main(String[] args) {
	
		List<Integer> sortList(ArrayList<Integer> List)
		{
			return list.stream().sorted().collec(Collectors.toList());
		}
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		arr.add(15);
		arr.add(7);
		arr.add(12);
		arr.add(50);
		arr.forEach(System.out::println);
		System.out.println("======sort=====");
		arr.stream().sorted().forEach(System.out::println);

	}

}

