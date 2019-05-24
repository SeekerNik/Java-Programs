import java.io.*;
import java.util.*;
public class StockMarket
{
	public static void main(String args[])
		{
		try
		{
			File f=new File("Stock.txt");
			Scanner in=new Scanner(f);
		while(in.hasNext())
		{
			System.out.println(in.next());
		}
		}
		catch(Exception e)
		{
		}
	}
}