package InitializerBlock;

public class InstanceInitializer {

	int x;
	{	
		System.out.println("this is instance initilizer and it run's when and object is created");
		System.out.println("this runs everytime when the object is created ");
		System.out.println(" "+x);
		x++;
		System.out.println("the value of x "+x);
	}
	public static void main(String[] args) 
	{
		
		
		InstanceInitializer o1=new InstanceInitializer();
		InstanceInitializer o2=new InstanceInitializer();
	}

}
