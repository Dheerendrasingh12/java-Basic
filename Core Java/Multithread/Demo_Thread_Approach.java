class Demo_Thread_Approach 
{
	public static void main(String[] args) 
	{
		Thread_Approach t=new Thread_Approach
			();
		Thread t1=new Thread(t);
		t1.start();

		System.out.println("Main method!");
	}
}
