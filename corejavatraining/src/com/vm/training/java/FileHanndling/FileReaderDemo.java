package com.vm.training.java.FileHanndling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		File  f  =new File("santosh.txt");
		FileReader  fr  =new FileReader(f);
		/*System.out.println((char)fw.read());
		System.out.println((char)fw.read());
		System.out.println(fw.read());
		System.out.println(fw.read());
		System.out.println(fw.read());
		System.out.println(fw.read());*/
		int readChar= fr.read();
		while(readChar!=-1)
		{
			try {
				Thread.sleep(5000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	

}
