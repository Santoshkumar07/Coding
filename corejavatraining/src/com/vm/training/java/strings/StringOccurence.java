package com.vm.training.java.strings;

import java.util.*;
public class StringOccurence {
	
	public static void main(String[] args) {
		
		Scanner str = new Scanner(System.in);
		String s = str.nextLine();
		
		int count = 0;
	    for (int i=0; i < s.length(); i++)
	    {
	        if (s.charAt(i) == 'a')
	        {
	             count++;
	        }
	    }
		System.out.println("occurrence of a: "+count);
	}
}
