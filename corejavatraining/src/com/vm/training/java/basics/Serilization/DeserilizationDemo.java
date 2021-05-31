package com.vm.training.java.basics.Serilization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserilizationDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois  = new ObjectInputStream(fis);
		
		
	}

}
