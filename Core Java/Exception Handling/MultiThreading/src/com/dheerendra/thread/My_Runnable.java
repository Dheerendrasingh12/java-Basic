package com.dheerendra.thread;

public class My_Runnable implements Runnable{
public void run() {
	System.out.println("MY_Runnable Target");
}

}

class My_Thread extends Thread{

	public My_Thread() {
		super();
		// TODO Auto-generated constructor stub
	}
	My_Thread(Runnable target){
		super(target);
	}
	public void run() {
		System.out.println("My_Thread.run");
	}
}