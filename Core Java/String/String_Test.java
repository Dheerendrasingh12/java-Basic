class String_Test 
{
	public static void main(String[] args) 
	{
		String s1="Dheerendra";
		
		System.out.println("s1 :"+s1);
		System.out.println("s1 "+s1.toString());

		String s2=new String("Love Hate");
		System.out.println("s2 :"+s2);
		
		System.out.println("s2 :"+s2.toString());

		String s3=null;
		
		System.out.println("s3 :"+s3);
		
		//System.out.println("s3 :"+s3.toString());
		
		String s4;
		//System.out.println("S4 :"+s4);
		System.out.println("s5 :"+s5);
		

		A a1=new A(1203);
		System.out.println("a1 :"+a1);
		System.out.println("a1 :"+a1.toString());
		A a2=null;
		System.out.println("a2 :"+a2);

		A a3;
		//System.out.println("a3 :"+a3);

		System.out.println("a4 :"+a4);
		
	}
	static String s5;
	static A a4;
}
class A
{
	private int x;
	A(int x){
		this.x=x;
	}

	public String toString(){
		return ""+x;
	}

}