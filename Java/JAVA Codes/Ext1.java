import java.util.*;
public class Ext1
{
	public static void main(String args[])
	{
		try
		{
			display();
		}
		catch(Exception e)
		{
			System.out.print("Occured");	
		}
	}
	static void display() throws Exception
	{
		int b=0;
		int c=10/b;
	}
}