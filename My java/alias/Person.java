package alias;
import static alias.Hair.*;

public class Person {

	static Hair hair=BLACK;
	 Hair hair2=RED;

					
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hair);
		Person peter=new Person();
		Person peter2=peter;
				
		Person Nikhil=peter;
		System.out.println("the hair color of perter is "+peter.hair);
		System.out.println("the hair color of perter is "+peter.skin);

		

	}

}
