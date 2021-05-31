package com.vm.training.java.basics.Serilization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) throws IOException {
		Employee e = new  Employee(1,"san");
		FileOutputStream fis = new FileOutputStream("abc.ser");
		ObjectOutputStream oos  = new ObjectOutputStream(fis);
		oos.writeObject(e);
		System.out.println("======Serilization Done=====");
	}

}
