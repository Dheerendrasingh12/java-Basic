package com.dheerendra.Pausing;

public class Join_Sleep_Thread_Test {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("main start ");
		Join_Sleep_Thread jt = new Join_Sleep_Thread();

		jt.start();

		//jt.join();

		 jt.join(5000);
		// jt.join(15000);
		 jt.sleep(15000);

		System.out.println("main end");

	}

}
