package com.dheerendra.multithread;

public class MyThread extends Thread {
	public void run() {
		for(int i=1;i<=20;i++) {
			System.out.println("run "+i);
		}
		
	}
	public static void main(String[] args) {
		MyThread mt=new MyThread();
		mt.start();
		mt.run();
		for(int i=1;i<=20;i++)
			System.out.println("main "i2w2w1z );
	}

}
