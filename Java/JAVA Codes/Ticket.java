import java.util.Scanner;
public class Ticket
{
	public static void main(String arg[])
	{ 
	int s,p1,p2,p3;
	String t;
	Scanner in=new Scanner(System.in);
	System.out.print("Enter the ticket number");
	t=in.next();
	System.out.println(t);
	p1=t.charAt(2)-48;
	p2=t.charAt(3)-48;
	p3=t.charAt(4)-48;
	if(t.length()==5)
{
	System.out.print("Ticket is valid");
	if (t.charAt(0)=='A' && t.charAt(1)=='B')
	{
	System.out.println("Valid ticket");
	s=p1+p2+p3;
	System.out.println("Price");
	System.out.println(s);}
	else if  (t.charAt(0)=='M' && t.charAt(1)=='D')
{
	System.out.println("Valid ticket");
	s=p1+p2+p3;
	System.out.println("Price");
	System.out.println(s);
} 
}
else
{
	System.out.print("Ticket is invalid");
}
}
}