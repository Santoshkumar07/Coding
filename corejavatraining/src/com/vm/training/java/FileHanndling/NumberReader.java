package com.vm.training.java.FileHanndling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class NumberReader {
	 public static void main(String args[])throws IOException{
		 
		 Scanner scanner = new Scanner(new File("numbers.txt"));
	      File f= new File("numbers.txt");
	        f.createNewFile();
	        System.out.println("file is created");
	        
	        
	        int num;
	         
	        while (scanner.hasNextInt()) {
	            if(num%2==0) {
	            	return;
	            }
	        }
	         
	        scanner.close();
	         
	        System.out.println("num = " + num);
}
}
