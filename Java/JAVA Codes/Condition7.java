import java.util.Scanner;
public class Condition7
{
	public static void main(String arg[])
	{
		char a;
		
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the number:");
		a=in.next().charAt(0);

		if ( a>=65 && a<=90 || a>=97 && a<=122)
		{

		System.out.print("alpha");
		}

if (a>=48 && a<=50)
{
System.out.print(" digit:");
}



	}




}