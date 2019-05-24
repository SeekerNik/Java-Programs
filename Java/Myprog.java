import java.util.*;

class A extends Thread
{
	public void run()
	{ 	for(int i=0;i<1000;i++);
		{
		System.out.println("this is from A");
		try
		{B obj=new B();
		obj.join(1000);
		obj.start();
		}
		
		catch(Exception e)
		{
		}
		}
	}

}

class B extends Thread
{
	public void run()
	{	
		for(int j=0;j<1000;j++)
		{
			System.out.println("this is from b");
		}
	}
}

public class Myprog
{
	public static void main(String arg[])
	{
	A obj1=new A();
	obj1.start();
	}
}