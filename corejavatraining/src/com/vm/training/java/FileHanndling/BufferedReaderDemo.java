package com.vm.training.java.FileHanndling;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
	public static void main(String[] args) throws IOException {
	FileReader  fw  =new FileReader("santosh.txt");
	BufferedReader  br =new BufferedReader(fw);
	String readChar= br.readLine();
	while(readChar!=null) {
			System.out.println(readChar);
			readChar=br.readLine();
			}
	}
}