class Argu_Parameter 
{
	static void m1(A a){
		System.out.println("m1");
	}

	
	static A m2(String a){
		System.out.println("m2");
		return new A();
	}
	public static void main(String[] args) 
	{
		A a1=new A();
		m1(a1);
		m2("Dheerendra");
		A a2=m2("SIngh");
		
		System.out.println(m2("K"));
	
	
	}
}
class A
{
};
