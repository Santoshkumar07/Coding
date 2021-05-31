package com.vm.training.java.FileHanndling;

import java.io.File;
import java.io.IOException;

public class CreateDemo {
	public static void main(String[] args) throws IOException{
		File  f  =new File("santosh.txt");
		if(f.exists()) {
			System.out.println("file is already present");
		}
		else {
			System.out.println("file is not present we  are creating");
			f.createNewFile();
			System.out.println("file is created");
		}
	}
}
