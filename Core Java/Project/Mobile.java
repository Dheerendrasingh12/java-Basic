public class Mobile 
{
	private SIM sim;

	public void insert(String simName)throws Exception {
		System.out.println("\n\n\nReflection API\n\n");
		Class simclass=Class.forName(simName);

		System.out.println("sim class "+simclass);


		Object simObject=simclass.newInstance();
		
		
		System.out.println("sim Object "+simObject);
		if(simObject instanceof SIM){
			sim=(SIM)simObject;

		}
		else{
			throw new Exception("Invalid Sim");
		}
	}

	public String sendSMS(String msg,long mobNum){
		return sim.sendSMS(msg,mobNum);
	}

	public String dialCall(long mobNum){
	
		return sim.dialCall(mobNum);
	}

}