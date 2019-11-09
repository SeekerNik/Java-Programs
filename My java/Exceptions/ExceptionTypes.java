package Exceptions;
import java.lang.String;

public class ExceptionTypes {

	public static void main(String[] args) {
//		there are 2 types of exception 
//		1.checked Exception(compile time)
//		2.unchecked Exception(run time) 
		
		try
		{
			String s1=null;
			//System.out.println(s1.length());
			System.out.println("Exception"+2/0);
			System.out.println("this is try");
			System.out.println("Nothing");
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
		
		finally
		{
			System.out.println("hello it's finally block is runs everytime ");
		}
	}

}
