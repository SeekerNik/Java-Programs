import java.util.*;
class Student
{
int roll_no;
String name;
char section;
void enter()
Scanner in=new Scanner(System.in);
System.out.println("Enter the roll no: ");
roll_no=in.nextInt();
System.out.println("Enter the name: ");
name=in.next();
}
void print()
{
System.out.println(roll_no);
System.out.println(name);
}
void setSection(String a)
{
section=a;
}
}
public class Setter
{
public static void main(String args[])
{
Student s1=new Student();
s1.enter();
s1.print();
s1.setSection('A');
} 
}


} 