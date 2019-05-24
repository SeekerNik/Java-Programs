package Inheritances;

public class Student extends person{
	public void getvalue(int a,String b,String c)
	{
		age=a;
		name=b;
		address=c;
	}
	
	public void printval()
	{
		System.out.println("Name :"+name);
	    System.out.println("age :"+age);
	    System.out.println("address "+address);
	}
}
