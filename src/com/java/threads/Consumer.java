package com.java.threads;

import java.util.ArrayList;
import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
	private BlockingQueue<Integer> arr;
	public Consumer(BlockingQueue<Integer> array){
		this.arr=array;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (arr){
			while(true){
				try {
					System.out.println("Consuming elements." + consume());

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
	}}
	
	private int consume() throws InterruptedException{
		synchronized (arr){
			while(arr.isEmpty()){
				try {
					System.out.println("Consumer finds array to be empty.");
					arr.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		synchronized (arr){
			System.out.println("Consumer clearing the array.");
			
				arr.notifyAll();
				return arr.poll();
		}
	}

}
