package com.vm.training.java.Collections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;
import java.util.List;
import java.util.Map;
class ArrayListTest
{

	public static void main(String[] args)
	{
	ArrayList<ArrayList<String>> mainArrayList = new ArrayList<ArrayList<String>>();

		ArrayList<String> subArrayList = new ArrayList<String>();
		subArrayList.add("guntur");
		subArrayList.add("WG");
		subArrayList.add("krishna");
		subArrayList.add("EG");
		ArrayList<String> subArrayList2 = new ArrayList<String>();
		subArrayList.add("10000");
		subArrayList.add("5000");
		subArrayList.add("8000");
		subArrayList.add("3000");
		
		mainArrayList.add(subArrayList);
		mainArrayList.add(subArrayList2);		

		for (int i = 0; i < mainArrayList.size(); i++) 
		{

		for (int j = 0; j < mainArrayList.get(i).size(); j++) 
		{

		System.out.print(" " + mainArrayList.get(i).get(j));

		}

		System.out.println();

		}
	}
}