abstract  class Bus
{
	abstract void engine();

	void breaks(){
	System.out.println("Breaks applied Bus Stopped");
	}
	void wheel(){
	System.out.println("Bus will run on 6 wheels");
	}
};
 class RedBus extends Bus
{
	 void engine(){
	System.out.println("Red Bus engine capacity 40 KMPH");
	

	}

};
 class Volvo extends Bus
{
	 void engine(){
	System.out.println("Volvo Bus engine capacity 140 KMPH");
	

	}

};
class Test
{
	public static void main(String...args){
		Bus b=new Volvo();
		b.engine();
		b.breaks();
		b.wheel();
	}
};