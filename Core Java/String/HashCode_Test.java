class HashCode_Test 
{
	public static void main(String[] args) 
	{
		String s1=new String("D");
		System.out.println(s1.hashCode());
		String s2=new String("D");
		System.out.println(s2.hashCode());
		String s3=new String("Dheerendra");
		System.out.println(s3.hashCode());

		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));

		String s4="s";
		String s5="s";

		System.out.println(s4.hashCode());
		System.out.println(s5.hashCode());
		System.out.println();
		System.out.println(System.identityHashCode(s4));
		System.out.println(System.identityHashCode(s5));
		
		Example e1=new Example(12);
		System.out.println(e1.hashCode());

		Example e2=new Example(12);
		System.out.println(e2.hashCode());

		Example e3=new Example(24);
		System.out.println(e3.hashCode());


		System.out.println(System.identityHashCode(e1));
		System.out.println(System.identityHashCode(e2));
		System.out.println(System.identityHashCode(e3));


		e1.x=101;
		e2.x=102;
		e3.x=103;

		System.out.println(e1.hashCode());

		System.out.println(e2.hashCode());

		System.out.println(e3.hashCode());


		System.out.println(System.identityHashCode(e1));
		System.out.println(System.identityHashCode(e2));
		System.out.println(System.identityHashCode(e3));
	
	}
}

class Example
{
	int x;
	Example(int x){
		this.x=x;
	}
	public int hashCode(){
		return x;
	}

}