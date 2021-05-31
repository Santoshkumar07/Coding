package com.vm.training.java.exceptionhandling;
import java.io.*;
import java.sql.Connection;
import java.sql.SQLException;
public class TryWithResourcesTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(FileOutputStream fos = new FileOutputStream(new File("D:/Santosh.txt"));Connection con = DriverManager.getConnection("url","un","pwd"))
				
		{
			String s = "value Momentum";
			byte[] by = s.getBytes();
			fos.write(by);
			System.out.println("success");
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
			}
		catch(IOException e1) {
			e1.printStackTrace();
		}
		catch(SQLException e2) {
			e2.printStackTrace();
		}
	}

}
