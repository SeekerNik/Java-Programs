class key
{
	int a;
	
}

class key2 extends key
{
	int a;
	public void fun(int a)
	{
		this.a=a;
		super.a=a;
		System.out.println(this.a);
		System.out.println(super.a);
	}
	
	public void fun2(int b)
	{
		super.a=b;
		System.out.println(super.a);
		System.out.println(this.a);
	}
}
public class Superkeyword {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		key2 k=new key2();
		k.fun(4);
		k.fun2(43);
	}

}
