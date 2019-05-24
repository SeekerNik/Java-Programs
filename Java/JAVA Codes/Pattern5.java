import java.util.Scanner;
public class Pattern5
{
	public static void main(String arg[])
	{ 
int k=1;
	for(int i=4;i>=1;i--)
{
for(int j=1;j<=i;j++)
{
System.out.print(k);
k=k+1;
}
k=1;
System.out.println();
}
}
}