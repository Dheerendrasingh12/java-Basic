package com.dheerendra.Pausing;

public class Join_Sleep_Thread_Test2 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("main started");
		Join_Sleep_Thread2 jt1=new Join_Sleep_Thread2();
		jt1.setName("Child1");
		jt1.start();
		
		
		Join_Sleep_Thread2 jt2=new Join_Sleep_Thread2();
		jt2.setName("Child2");
		jt2.start();
		
		jt1.join();
		jt2.join();
		
		System.out.println("main end");
		
	}

}
