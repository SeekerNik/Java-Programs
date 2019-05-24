import java.io.*;
class student1 implements Serializable
{
	String School1="Eureka public School";
	String School2="C.L public School";
	String college="CGC Landran";


	
		void save() throws Exception
	{
		FileOutputStream file1=new FileOutputStream("fileout1.txt");
		ObjectOutputStream Ob1=new ObjectOutputStream(file1);
		Ob1.writeObject(this);
		Ob1.flush();
	}
	
	void open() throws Exception
	{
		FileInputStream file2=new FileInputStream("fileout1.txt");
		ObjectInputStream ob=new ObjectInputStream(file2);
		student1 d=(student1)ob.readObject();
		this.School1=d.School1;
		this.School2=d.School2;
		this.college=d.college;
	}
	
	void print() 
	{
		System.out.println(School1);
		System.out.println(School2);
		System.out.println(college);
	}
	
}
public class ImplementsSerializable1
{
	public static void main(String ard[]) throws Exception
	{
		student1 obb=new student1();
		obb.save();
		obb.open();
		obb.print();
	}
}

