package com.dheerendra.Pausing;

public class Interrupt_Thread_Test extends Thread{
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main start");
		Interrupt_Thread it=new Interrupt_Thread();
		it.interrupt();
		it.start();
		
		it.interrupt();
	//	it.interrupt();
	
		Thread.sleep(2000);
	
		it.interrupt();
		
		System.out.println("main end");
		
	}

}
