import java.util.*;
class A extends Thread
{
	public void run()
	{
		while(true)
		{
		System.out.print("This is A");
		}
	}
}
class B extends Thread
{
	public void run()
	{
		System.out.print("This is A");
	}
}
public class Thd
{
	public static void main(String args[])
	{
		A obj=new A();
		obj.start();
		while(true)
		{
			System.out.print("From Main");
		}		
	}
}