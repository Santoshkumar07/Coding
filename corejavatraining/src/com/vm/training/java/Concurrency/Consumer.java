package com.vm.training.java.Concurrency;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
	BlockingQueue<Integer>commonQueue;
	
	public Consumer(BlockingQueue<Integer> commonQueue) {
		super();
		this.commonQueue = commonQueue;
	}

	public void run() {
		while(true)
		{
			try {
				System.out.println("Consumer");
				System.out.println("consumer  is taking"+ commonQueue.take());
				System.out.println("============================");
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
