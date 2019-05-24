import java.util.Scanner;
public class Condition1
{
	public static void main(String arg[])
	{
		int a,b,c;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the sides:");
		a=in.nextInt();
b=in.nextInt();
c=in.nextInt();
		if(a==b && b==c)
		{
		System.out.print("Equilateral triangle");}
		if(a==b || b!=c)
		{
		System.out.print("Isoceles");
		}
		if(a!=b && b!=c)
		{
		System.out.print("Scalar");
		}
		



	}




}