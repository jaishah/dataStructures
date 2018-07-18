package com.java.threads;

import java.util.ArrayList;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
	private BlockingQueue<Integer> arr;

	public Producer(BlockingQueue<Integer> array) {
		this.arr = array;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (arr) {
			while (!arr.isEmpty()) {
				try {
					System.out.println("Producer Waiting as array is full.");
					arr.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			synchronized(arr){
			try {
				arr.put(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Producer making the array full.");
			arr.notifyAll();
		}
		}
	}

}
