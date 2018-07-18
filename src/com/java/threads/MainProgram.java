package com.java.threads;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class MainProgram {

	private BlockingQueue<Integer> arr;
	
	public static void main(String[] args){
		MainProgram m = new MainProgram();
		m.arr = new ArrayBlockingQueue<>(5);
		m.arr.add(2);
		m.arr.add(3);
		m.arr.add(4);
		Producer p = new Producer(m.arr);
		Thread prod  = new Thread(p);
		Consumer c = new Consumer(m.arr);
		Thread con  = new Thread(c);
		prod.start();
		con.start();
	}

}
