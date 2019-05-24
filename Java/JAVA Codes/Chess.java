import java.util.*;
abstract class character
{
int life,team;
abstract void move();
}
class trunk extends character
{
void move()
{
System.out.println("Trunk");
}
}
class queen extends character
{
void move()
{
System.out.print("Queen");
}
}
class Chess
{
public static void main(String args[])
{
character ch1;
ch1=new trunk();
ch1.move();
ch1=new queen();
ch1.move();
}
}