class c1
{
	c1()
	{
		System.out.println("this is A");
	}
}

class c2 extends c1
{
	c2()
	{
		this(4);
		System.out.println("this is B");
	}
	
	c2(int a)
	{
		System.out.println("this is arg B");
	}
}
public class ConstructorChain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c2 d=new c2();
	}

}
