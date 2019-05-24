import java.lang.String;
public class Stringfunctionjava {

	public static void main(String[] args) 
	{
		int c1=0;
		nik c = new nik();
		c.Hello();
		String ch="hello";
		String ch2="hello";
		
		System.out.println("hello this is nikhil"+c1);
		if(ch instanceof java.lang.String)
		{
			System.out.println("ch is a part of String class");
		}
		boolean b1=true;
		boolean b2=false;
		boolean b3=false;
		boolean b4=true;
		System.out.print("hello this is " +b4);
		
		if(ch==ch2)
		{
			System.out.println("same value");
		}
		
		else if(ch!=ch2)
		{
			System.out.println("no match");
		}
	}

	
}

class nik
{
	public String hello="Hello this is Nikhil";
	public void Hello()
	{
		System.out.println(hello);
	}
}