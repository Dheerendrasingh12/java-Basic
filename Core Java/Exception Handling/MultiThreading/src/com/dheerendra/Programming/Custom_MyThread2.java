package com.dheerendra.Programming;

public class Custom_MyThread2 extends Thread{

	public void run() {
		Custom_MyThread1 mt1=new Custom_MyThread1();
		mt1.start();
		for(int i=1;i<=20;i++) {
			System.out.println("mythread 2 run "+i);
		}
	}
}
