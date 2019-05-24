import java.util.*;
public class Pattern9
{
	public static void main(String arg[])
	{ 
	int row=5,col=4;
double mid;
mid=(row/2)+1;
for(int i=1;i<=row;i++)
{
	for(int j=1;j<=col;j++)
{
	if(i==1 || i==mid || i==row)
{
System.out.print("*");
}
else
{
if(j==1)
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
}
System.out.println();
}
}
}