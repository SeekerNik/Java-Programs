import java.util.*;
import math.*;
public class Pattern8
{
	public static void main(String arg[])
	{ 
	int row,col;
double mid;
mid=ceil(row/2);
for(int i=1;i<row;i++)
{
	for(int j=1;j<col;j++)
{
	if(j==1 || j==col)
{
System.out.print("*");
}
else
{
if(i==mid)
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