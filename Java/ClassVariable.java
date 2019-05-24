//Static variable are also called Class Variables
class StaticClassVariable
{
	public static String name;
	public static String roll;
}

class ClassVariable
{
	public static void main(String arg[])
	{
	StaticClassVariable.name="nikhil";
	StaticClassVariable.roll="1726231";
	System.out.println(StaticClassVariable.name);
	System.out.println(StaticClassVariable.roll);
    StaticClassVariable.name="pulkit";
	StaticClassVariable.roll="1726250";
	System.out.println(StaticClassVariable.name);
	System.out.println(StaticClassVariable.roll);
	
	}
}