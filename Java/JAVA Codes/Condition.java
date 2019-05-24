import java.util.Scanner;
public class Condition
{
	public static void main(String arg[])
	{
		int a;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the number:");
		a=in.nextInt();
		if(a%5==0 && a%7==0)
		{
		System.out.print("Ravi Shastri");}
		if(a%5==0 && a%7!=0)
		{
		System.out.print("Kohli");
		}
		if(a%7==0 && a%5!=0)
		{
		System.out.print("Dhoni");
		}
		



	}




}