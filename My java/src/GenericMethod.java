class fun
{
	public <E> void fun1(E arg[])
	{
		for(E x:arg)
		{
			System.out.println(x);
		}
	}
}
public class GenericMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun a=new fun();
		String ar[]=new String[] {"hello","nihao","namaste"};
		//int ar2[]=new int[] {2,3,4,5,6,7}; only non-primitive method is used for generic method 
		Integer ar2[]=new Integer[] {2,4,5,6,7};
		a.fun1(ar);
		a.fun1(ar2);
		
	}

}
