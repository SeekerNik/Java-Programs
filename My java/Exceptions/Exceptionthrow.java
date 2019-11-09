package Exceptions;

public class Exceptionthrow {

	public static void main(String[] args) {
		try{
			
			int num=220;
			int num2=333;
			if(num<num2)
			throw new ArithmeticException("num2 is greater than num");
			
		}
		
//		catch(ArithmeticException e)
//		{
//			System.out.println(e.getMessage());
//		}

		finally
		{
			System.out.println("hello");
		}
	}

}
