class A
{
	static int a=10;
	int x=20;

	static class B
	{
		static int a=50;
		int x=60;
		void m1(){
		System.out.println("a "+a);
		System.out.println("x "+x);	
		
		A a=new A();
		System.out.println("a "+A.a);
		System.out.println("x "+a.x);	
		
		
		}
	};
	void m2(){
		System.out.println("a "+a);
		System.out.println("x "+x);	
		
		B b=new B();
		System.out.println("a "+B.a);
		System.out.println("x "+b.x);	
		
		

	}
	public static void main(String[] args) 
	{
		A a=new A();
		a.m2();
	System.out.println("\n");
		B b=new B();
		b.m1();


	}
};

class Test 
{
	public static void main(String[] args) 
	{
		A a1=new A();
		A.B b1=new A.B();
	}
}
