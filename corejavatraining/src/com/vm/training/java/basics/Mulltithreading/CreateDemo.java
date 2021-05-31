package com.vm.training.java.basics.Mulltithreading;

class Maniteja  extends Thread{
	public void run()
{
		for(int i=1;i<=10;i++)
		{
			//try {
				//sleep(5000);
			}
		//	catch(InterruptedException e)
			
			System.out.println("Maniteja "+  i);
		}
		}
//}
class 	Santosh  extends Thread{
	public void run()
{
		for(int i=11;i<=20;i++)
		{
			System.out.println("Santosh"+ i);
		}
		}
}
class Shashank extends Thread{
	public void run()
{
		for(int i=21;i<=30;i++)
		{
			System.out.println("Shashank"+  i);
		}
		}
}
public class CreateDemo {

	public static void main(String[] args) {
		Maniteja m = new Maniteja();
		Santosh s = new Santosh();
		Shashank  sa= new Shashank();
		//m.run();
		//s.run();
		//sa.run();
		//m.setName();
		
		
		m.start();
		s.start();
		sa.start();
		
	}

}
