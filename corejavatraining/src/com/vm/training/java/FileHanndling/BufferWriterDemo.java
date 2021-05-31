package com.vm.training.java.FileHanndling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterDemo {

	public static void main(String[] args) throws IOException {
		FileWriter  fw  =new FileWriter("santosh.txt");
		BufferedWriter  bw  =new BufferedWriter(fw);
		bw.write("hello");
		bw.newLine();
		bw.write("java");
		bw.newLine();
		bw.write("stayhome");
		bw.flush();
		bw.close();
		System.out.println("buffered writer created");
		
	}

}
