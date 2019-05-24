public class Pattern7
{
	public static void main(String arg[])
	{ 
	int k=1;
	int count=0;
	for(int i=1;i<=4;i++)
{
for(int h=1;h<=count;h++)
{
System.out.print(" ");
}
for(int j=4;j>=i;j--)
{
System.out.print(k);
k=k+1;
}

k=1;
System.out.println();
count++;
}
}
}
