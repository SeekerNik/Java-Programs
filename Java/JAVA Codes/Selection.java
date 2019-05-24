import java.util.Scanner;
public class Selection
{
	public static void main(String arg[])
	{
	String g;
	float h,w;
	Scanner in=new Scanner(System.in);
	System.out.print("enter the gender");
	g=in.next();
	System.out.print("enter the height");
	h=in.nextFloat();
	System.out.print("enter the weight");
	w=in.nextFloat();
if(g=="m")
{
if(h>=5.7 && w>=69)
{
System.out.print("Selected");
}
}
else if(g=="f")
{
if(h>=5.3 && w>=60)
{
System.out.print("Selected");
}
}
}
}