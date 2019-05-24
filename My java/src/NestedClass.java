class Outer
{
	int a1=88;
	static int a2=24;
	static class Inner1
	{
		public void fun1()
		{
			System.out.println("this is inner static class :"+a2);
		}
	}
	
	class Inner2
	{
		public void fun2()
		{
			System.out.println("this is inner non-static class :"+a1+"  static :"+a2);
			
		}
	}
}
public class NestedClass {
public static void main(String arg[]) 
{
	Outer.Inner1 sta=new Outer.Inner1();
	sta.fun1();
	Outer out=new Outer();
	Outer.Inner2 nonsta=out.new Inner2();
	nonsta.fun2();
}
}
