class Apple
{
	public void fun1()
	{
		System.out.println("Nothing");
	}
}

class Mi
{
	//anonymous class has two important things
	//1.it is always be a inner class
	//2.it is always be a subclass of super class
	Apple a=new Apple(){
		public void fun1()
		{
			System.out.println("this is anonymous class :");
		}
	};     
}
public class AnonymousClass 
{
	public static void main(String arg[])
	{
		Mi c=new Mi();
		c.a.fun1();
	}
}
