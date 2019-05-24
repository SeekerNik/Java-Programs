import java.io.*;
import java.util.*;
public class StockMarket1
{
	public static void main(String args[])
		{
		try
		{
			File f=new File("Stock.txt");
			Scanner in=new Scanner(f);
			Scanner keyboard=new Scanner(System.in);
			System.out.print("Enter the name:");
			String name=keyboard.next();
			int flag=0;
		while(in.hasNext())
		{
			if(name.equals(in.next()))
			{
			System.out.println(in.next());
			flag=1; 
			}
		}
		if(flag==0)
		{
			System.out.print("No such Stock exists.");				
		}
		}
		catch(Exception e)
		{
		}
	}
}