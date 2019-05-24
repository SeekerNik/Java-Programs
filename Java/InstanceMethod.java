class InstanceMethod
{
	public static void main(String arg[])
	{
		Student obj1=new Student();
		obj1.name_ofstudent("Nikhil Saini");
		obj1.Grade(99.333);
		obj1.name_ofstudent("Sahil Pahuja");
		obj1.Grade(99.999);
	}
}

class Student
{
	public void name_ofstudent(String a)
	{
		System.out.println("The Name of the student :"+a);
		
	}
	public void Grade(double b)
	{
		System.out.println("THE GRADE OF THE STUDENT IS :"+b);
	}
}
