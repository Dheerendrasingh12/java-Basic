class A1 
{
	static int a=m1();

	static int m1(){
		System.out.println("A Static variable");
		return 12;
	}
	static {
		System.out.println("A Static block");
		
	}
	public static void main(String[] args) 
	{
		System.out.println("A Main");
	}
}
class B extends A1
{
	static int b=m2();
	static int m2(){
		System.out.println("B Static variable");
		return 24;
	}
	static {
	System.out.println("B static block");
		
	}
	public static void main(String[] args) 
	{
		System.out.println("B Main");
		System.out.println("B Main a"+a);
		System.out.println("B Main b"+b);
	}

};
