import java.util.*;
class Area
{
private int r1,r2,area;
void enter()
{
Scanner in=new Scanner(System.in);
System.out.print("Enter the radius1: ");
r1=in.nextLine();
System.out.print("Enter the radius2: ");
r2=in.nextLine();
}
void print()
{
System.out.print("Area of  circle is: "+(3.14)*r1*r1);
}
}
public class Circle
{
public static void main(String args[])
{
Circle c=new Circle();
c.enter();
c.print();
}
}