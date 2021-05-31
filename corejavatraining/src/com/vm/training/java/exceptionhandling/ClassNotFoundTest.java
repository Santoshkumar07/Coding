package com.vm.training.java.exceptionhandling;
import java.io.*;

public class ClassNotFoundTest {

	public static void main(String[] args) {
		
		try {
			
			Class.forName("HW");
			System.out.println("found class");
			}
		catch(ClassNotFoundException e) {
		e.printStackTrace();
	}

	}
}	
