class A4
{

	static int a=10;
	int b=10;

	static void m1(final int c,int d){
		final int e=10;
		int f=10;
		class B
		{
			void m1(){
	
		System.out.println(a);
		//System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);		
			}
		};

	}

	void m2(){
		class C
		{
			void m2(){
			
				System.out.println(a);
				System.out.println(b);
			}
		};
	}

	public static void main(String[] args) 
	{
		A4 a1=new A4();
		a1.a=5;
		a1.b=;
		a1.m16(,8);
	
	}
}