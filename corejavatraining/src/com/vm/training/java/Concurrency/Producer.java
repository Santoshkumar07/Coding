package com.vm.training.java.Concurrency;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
	BlockingQueue<Integer> commonQueue ;
	
	public Producer(BlockingQueue<Integer> commonQueue) {
		super();
		this.commonQueue = commonQueue;
	}

	public void run() {
		for(int i=1;i<10;i++) {
			commonQueue.add(i);
			System.out.println("elements add"+ i);
			System.out.println("queue  elements are"+ commonQueue);
		}
		
	}

}
