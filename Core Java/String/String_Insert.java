class  String_Insert
{
	public static void main(String[] args) 
	{
/*
StringBuffer sb1=new StringBuffer("DheerendraSingh");
	sb1.insert(10,' ');
		
		System.out.println(sb1);*/

		String s1="a";
		String s2="a";

		System.out.println(s1);
		
		System.out.println(s2);
		s1=s1+"b";
		System.out.println(System.identityHashCode(s1));
		
		System.out.println(s1);
		//
		//s1.null;
		
		System.out.println(s2);

		s1=null;
		
		System.out.println(s1);
	}
}
