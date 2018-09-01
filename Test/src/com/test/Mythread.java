package com.test;

public class Mythread implements Runnable{

	private int count=5;
	@Override
	public synchronized void run() {
		while(count>0){
			count--;
			System.out.println(count);
		}
	
		
	}

}
