class A92
{
	void m1(float f){
	System.out.println("float");
	}
};
class B92 extends A92
{
	void m1(int a){
	System.out.println("int");
	}
};
class MOL_Inheritance 
{
	public static void main(String[] args) 
	{

		B92 b=new B92();
		b.m1(50);
		b.m1('d');
		b.m1(50L);
		System.out.println("Hello World!");
	
	
		A92 a=new B92();
		a.m1(50);
		a.m1('d');
		a.m1(50L);
	}
}