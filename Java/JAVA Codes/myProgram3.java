import java.util.*;
class Laptop
{
private String RAM, Harddisk, Graphics;
private String Brand;
void enter()
{
Scanner in=new Scanner(System.in);
System.out.print("Enter the RAM: ");
RAM=in.nextLine();
System.out.print("Enter the Harddisk: ");
Harddisk=in.nextLine();
System.out.print("Enter the Graphics: ");
Graphics=in.nextLine();
System.out.print("Enter the Brand: ");
Brand=in.next();
}
void print()
{
System.out.println(RAM);
System.out.println(Harddisk);
System.out.println(Graphics);
System.out.print(Brand);
}
}
public class myProgram3
{
public static void main(String args[])
{
Laptop l=new Laptop();
l.enter();
l.print();
}
}