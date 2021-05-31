package com.vm.training.java.FileHanndling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException{
		File  f  =new File("santosh.txt");
		FileWriter  fw  =new FileWriter(f,true);
		fw.write("\n");
		fw.write("ab");
		fw.write("hello");
		fw.flush();
		fw.close();
		
		System.out.println("data  is  written");
	}

}
