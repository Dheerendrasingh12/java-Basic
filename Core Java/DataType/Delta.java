interface Foo{}
class Alpha implements Foo
{
}

class Beta extends Alpha
{
}

class  Delta
{
	public static void main(String[] args) 
	{
		Beta x=new Beta();
//		Alpha a=x;
		Foo f=(Delta)x;
		//Foo f=(Alpha)x;
		//Beta b=(Beta)(Alpha)x;
	}

}
