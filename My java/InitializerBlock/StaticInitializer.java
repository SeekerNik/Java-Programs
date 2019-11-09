package InitializerBlock;

public class StaticInitializer {

	public static int a;
	static
	{
		System.out.println("this is static block and it runs when we create obj :"+a);
		a=20;
	}
	
	public static void main(String[] args) 
	{
		
	
		new StaticInitializer();
		new StaticInitializer();
		
		
	}
	
}
