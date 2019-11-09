class A2
{
	public int a;
	A2()
	{
		a=10;
		System.out.println(a); 
	}
	A2(int a)
	{
		this.a=a;
		System.out.println(a);
		
	}
}
class B2 extends A2
{
	public int b=10;
	B2()
	{	
		super(44);
		System.out.println(b);
	}
}
	

public class ConstructorInheritance {

	public static void main(String[] args) {
		B2 a1=new B2();

	}

}
