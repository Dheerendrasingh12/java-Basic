
package com.dheerendra.Pausing;

public class Yield_Thread extends Thread{

	public void run() {
		for(int i=1;i<10;i++) {
		System.out.println("run "+i);
	}}
}
