package Exceptions;

public class ExceptionsInJava {

	public static void main(String[] args)
	{
		/*There are mainly a class Throwable whose subclasses are
		 * 1.Error class 
		 * 2.Exception class
		 * 
		 * ->Exception class has some subclass 
		 *  1.RuntimeException class
		 *  2.ClassNotFoundException class
		 *  3.IOException class
		 *  
		 * ->RuntimeException has subclasses
		 *  1.NullPointerException
		 *  2.ArithmaticException
		 *  3.IllegalArgumentException
		 *  
		 *  3.1.NumberFormatException
		 *  
		 *  
		 *  there are four types of exception handling
		 *  1.default throw and default catch
		 *  2.default throw and out catch
		 *  3.our throw and our catch
		 *  4.our throw and default catch*/
		
		
		
		System.out.println("Exception :"+(3/0));//this is the example of  1.
		System.out.println("hello");
	}

}
