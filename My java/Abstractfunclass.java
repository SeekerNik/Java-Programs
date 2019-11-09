abstract class an //abstract method object can't be created only inherited by other class
{
	abstract void fun();
}

class bn extends an
{
	void fun()//if you are defining a abstract fun in abstract class than you have to override it
	{
			System.out.println("this is bn");
	}
}
public class Abstractfunclass {

	public static void main(String args[])
	{
		bn a=new bn();
		a.fun();
	}
}
