interface i1
{
	long sta=55; //final , static and public
	
	void fun();// abstract and public
	
	//there is no constructor because constructor is use to initialize the var but 
	//the var is static and final so constructor is not needed
}

interface i2
{
	void fun2();
}

interface i3 extends i1 , i2 //interface inherited another interface
{
	void fun3();
}

//class implements two interfaces
public class Interfaces implements i1,i2  
{

	public void fun()
	{
		System.out.println("this is interfaces 1");
	}
	
	public void fun2()
	{
		System.out.println("this is interface 2");
	}
	public static void main(String[] args) 
	{
		i1 obj=new Interfaces();//interface reference obj can have the address of class obj
		obj.fun();
	  //obj.fun2(); can't possible because obj if ref obj of i1 only
		
	}

}
