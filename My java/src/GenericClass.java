class f <t>
{
	t n;
	public void fun1(t n)
	{
		this.n=n;
	}
	
	public void get2()
	{
		System.out.println(n);
	}
}
public class GenericClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f <Integer> m1=new f<Integer>();
		m1.fun1(38);
		f <String> m2=new f<String>();
		m2.fun1("hello this is nikhil");
		m1.get2();
		m2.get2();
		
	}

}
