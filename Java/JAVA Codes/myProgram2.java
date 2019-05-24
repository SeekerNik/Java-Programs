import java.util.*;
class Laptop
{
private String RAM, Harddisk, Graphics;
private String Brand;
void enter(String r, String h, String g, String b)
{
RAM=r;
Harddisk=h;
Graphics=g;
Brand=b;
}
void print()
{
System.out.print(RAM+" "+Harddisk+" "+Graphics+" "+Brand);
}
}
public class myProgram2
{
public static void main(String args[])
{
Laptop l=new Laptop();
l.enter("4GB","2TB","4GB","Apple");
l.print();
}
}