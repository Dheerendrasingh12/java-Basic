package com.dheerendra.priority;

public class Thread_Priority_Test {
	public static void main(String[] args) {
		Thread_Priority mt1=new Thread_Priority();
		Thread_Priority mt2=new Thread_Priority();
		
		mt1.setPriority(7);
		mt2.setPriority(8);
		
		mt1.start();
		mt2.start();
		
		System.out.println("main executed");
	}
}
