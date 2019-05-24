class a
{ 
	void fun(int a)
	{
		System.out.println("this is fun of a");
	}
	
	
}

class b extends a
{
	void fun(int a,int b) {
		System.out.println("this is fun of class b");
	}
}

class c extends a
{
	void fun(int a)
	{
		System.out.println("this is fun of class c");
	}
}
public class FunctionOverloadAndOverridding {

	public static void main(String[] args) 
	{
		b ob1=new b();
		ob1.fun(2);//fun overloading
		ob1.fun(2,2);//fun overloading 
		c ob2=new c();
		ob2.fun(22);//fun overriding
	}

}
