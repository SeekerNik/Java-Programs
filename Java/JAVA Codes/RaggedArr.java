import java.util.*;
public class RaggedArr
{
public static void main(String args[])
{
int data[ ][ ]=new int[3][ ];
int a,b,c;
Scanner in=new Scanner(System.in);
System.out.print("Enter the number of A items");
a=in.nextInt();
System.out.print("Enter the number of B items");
b=in.nextInt();
System.out.print("Enter the number of C items");
c=in.nextInt();
data[0]=new int[a];
data[1]=new int[b];
data[2]=new int[c];
for(int i=0;i<3;i++)
{
for(int j=0;j<data[i].length;j++)
{
data[i][j]=in.nextInt();
}
}
for(int i=0;i<3;i++)
{
for(int j=0;j<data[i].length;j++)
{
System.out.println("Enter the items: ");
}
}
}
}