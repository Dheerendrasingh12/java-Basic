import java.util.Scanner;
class Reverse_Each_Word
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter String");
		String str=scn.nextLine();
		int strlength=str.length()-1;
		String rev="",temp="";
		for (int i=0;i<=strlength ;i++ )
		{
			temp=temp+str.charAt(i);
			if (str.charAt(i)==' ' || i==strlength)
			{
				for (int j=temp.length()-1;j>=0 ;j-- )
				{
					rev=rev+temp.charAt(j);
					if (j==0 && i!=strlength)
					{
						rev=rev+" ";
					}
				}
				temp="";
			}
			
		}
		System.out.println(rev);
	}
}
