class Example 
{
	void m1(){
		
		System.out.println("m1");

	}
}
class Sample extends Example

{
	
	void m2(){
		
		System.out.println("m2");

	}

}

class Test
{
	public static void main(String args[]){
		Example e=new Sample();
		e.m1();
//		e.m2();
		Example e1=new Sample();
		e1.m1();
		Sample s=(Sample)e1;
		s.m2();
	}
}

