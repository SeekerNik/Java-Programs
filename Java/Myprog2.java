public class Myprog2
{	public static void main(String arg[])
	{String str1="hello";
	String str2="java";
	new Thread(new Runnable(){
	System.out.println("lock1");
	synchronized(str1)
	{
		synchronized(str2)
		{
		
		}
	}
	});
}
new Thread(new Runnable(){
	public void run()
	{	
	System.out.printn("lock2");
	synchronized(str1)
	{
		synchronized(str1)
		{
		
		}
	}
	}
	});
}