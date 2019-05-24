import java.util.*;
public class Local
{
	public static void main(String args[])
	{
		class Student
		{
		int roll_no;
		String name, dob;
		void enter_data()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the roll no: ");
			roll_no=sc.nextInt();
			System.out.println("Enter the name: ");
			name=sc.nextLine();
			System.out.println("Enter the dob: ");
			dob=sc.next();
		}
		void display()
		{
			System.out.println(roll_no);
			System.out.println(name);
			System.out.println(dob);
		}
		}
		Student s=new Student();
		s.enter_data();
		s.display();
	}
}