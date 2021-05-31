package com.vm.training.java.exceptionhandling;

import java.util.Scanner;

public class ProductTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Is the product recieved");
		String productnotrecieved=sc.nextLine();
		System.out.println("Is the product damaged or missed(yes/no)");
		String prouctDamaged=sc.nextLine();
		System.out.println("is the delivery days exceeded(yes/no)");
		String productexceeded=sc.nextLine();
		try
		{
			if(productnotrecieved.equals("yes"))
			{
				throw new ProductNotRecevied("We will deliver the product as soon as possible");
			}
			else
			{
				System.out.println("Enjoy the product");
			}
		}
		catch(ProductNotRecieved e)
		{
			e.printStackTrace();
		}
		
		try {
			if(Damaged.equals("yes"))
			{
				throw new ProductDamagedOrMissing("We will deliver another product");
			}
			else
			{
				System.out.println("Enjoy the product");
			}
		}
		catch(ProductDamagedOrMissing e1)
		{
			e1.printStackTrace();
		}

		try
		{
			if(exceeded.equals("yes"))
			{
				throw new ExceededMaxNoOfDays("We will refund the amount you paid for the product");
			}
			else
			{
				System.out.println("Enjoy the product");
			}
		}
		
		catch(ExceededMaxNoOfDays e2)
		{
			e2.printStackTrace();
		}

	}

}