import java.io.*;
class student implements Serializable
{
	int roll;
	int age;
	String name;
	
	student()
	{
		roll=1726231;
		age=20;
		name="nikhil";
		
	}
	
	void save() throws Exception
	{
		FileOutputStream file=new FileOutputStream("fileout.txt");
		ObjectOutputStream Ob=new ObjectOutputStream(file);
		Ob.writeObject(this);
		Ob.flush();
	}
	
	void print() 
	{
		System.out.println(name);
		System.out.println(roll);
		System.out.println(age);
	}
}

public class ImplementsSerializable
{
	public static void main(String arg[]) throws Exception
	{
		student obj1=new student();
		obj1.save();
		obj1.print();
	}
}