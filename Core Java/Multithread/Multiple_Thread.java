class Multiple_Thread 
{
	public static void main(String[] args) 
	{
		MyRunnable r=new MyRunnable();
		Thread t1=new Thread();
		Thread t2=new Thread(r);
	//	t1.start();
	//	t1.run();
		t2.run();
		for (int i=0;i<=12 ;i++ )
		{
			System.out.println("Main Thread");
		}
	}
}