interface Foo{}
class Alpha
{
};
class Beta extends Alpha implements Foo
{
};

class A91 
{
	void m1(Object obj){
		System.out.println("Object");
	
	}
	void m1(Alpha a){
		System.out.println("Alpha");
	}
	void m1(Foo fio){
		System.out.println("Foo");
	
	}
	public static void main(String[] args) 
	{
		A91 a=new A91();

		System.out.println("Hello World!");
	//	a.m1(new Beta());
		a.m1(null);
	}
}