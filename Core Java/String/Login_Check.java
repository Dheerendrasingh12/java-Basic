import java.util.*;
class  Login_Check
{
	public static void main(String[] args) 
	{
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Username");

		String usn=scn.nextLine();

	System.out.println("Enter password");

		String pwd=scn.nextLine();
		if(usn.equalsIgnoreCase("Dheerendra") && pwd.equals("Singh")){
			System.out.println("Welcome "+usn);
		
		}
		else{
			System.out.println("Intruder");
		}

	}
}
