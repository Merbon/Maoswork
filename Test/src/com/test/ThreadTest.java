package com.test;

public class ThreadTest {

	public static void main(String[] args) {
		Mythread th=new Mythread();
		Thread t1=new Thread(th);
		Thread t2=new Thread(th);
		t1.start();
		t2.start();
	}
}
