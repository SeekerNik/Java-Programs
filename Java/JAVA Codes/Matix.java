import java.util.*;
public class Matrix
{
public static void main(String args[])
{
int A[ ][ ]=new int[2][2];
int B[ ][ ]=new int[2][2];
Scanner in=new Scanner(System.in);
System.out.println("  enter  elements  of  A");
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
System.out.print("Enter the element: ");
A[i][j]=in.nextInt();
}
}

System.out.println("  enter  elements  of  B");
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
System.out.print("Enter the element: ");
B[i][j]=in.nextInt();
}
}



}
}