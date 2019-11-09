import java.util.*;
public class ScannerAndBufferInput 
{
	public static void main(String[] args) 
	{
		int age;
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter teh name and age :");
		name=sc.nextLine();
		age=sc.nextInt();
		System.out.println(name);
		System.out.println(age);
	}

}
