interface Vechile{
	void engine();
	void breaks();

}

abstract class Bus implements Vechile
{
	public void breaks(){
	System.out.println("Bus has two breaks");
	}
};











class  Driver
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
