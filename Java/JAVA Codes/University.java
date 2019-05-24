import java.util.*;
class Student
{
int roll_no;
String name;
static String college;

void enter()
{
Scanner in=new Scanner(System.in);
System.out.println("Enter the roll no: ");
roll_no=in.nextInt();
System.out.println("Enter the name: ");
name=in.next();
System.out.println("Enter the college: ");
college=in.next();
}
void print()
{
System.out.println(roll_no);
System.out.println(name);
System.out.print(college);
}
}
public class University
{
public static void main(String args[])
{
Student s1=new Student();
Student s2=new Student();
s1.enter();
s2.print();
} 



} 