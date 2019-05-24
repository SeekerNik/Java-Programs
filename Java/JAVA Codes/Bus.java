import java.util.Scanner;
public class Bus
{
	public static void main(String arg[])
	{
	int p=3,j;
	String g; 
	Scanner in=new Scanner(System.in);
	System.out.print("Stop A");
	System.out.println("Up or Down");
	g=in.next();
	if(g=="up")
	{
		System.out.print("how many");
		j=in.nextInt();
		p=p+j;
		System.out.print(p);
	}
	else if(g=="down")
	{
		System.out.print("how many");
		j=in.nextInt();
		p=p-j;
		System.out.print(p);
	if(p<=2)
	{
		System.out.print("Passengers not allowed");
	}
	else
	{
		System.out.print(p);
	}
}
}
}