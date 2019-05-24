import java.util.*;
class Bottle
{
private String material;
private float volume;
void enter(String m, float v)
{
material=m;
volume=v;
}
void print()
{
System.out.print(material+" "+volume);
}
}
public class myProgram1
{
public static void main(String args[])
{
Bottle b=new Bottle();
b.enter("plastic",10.5f);
b.print();
}
}