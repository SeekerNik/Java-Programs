import java.util.*;
class A
{
 A()
{
System.out.print("his is constructor of A");
}
}
class B extends A
{
 B()
{
System.out.print("his is constructor of B");
}
}
public class Program1
{
public static void main()
{
B obj=new B();
}
}