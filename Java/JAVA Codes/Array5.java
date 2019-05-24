import java.util.*;
public class SumofArray
{
public static void main(String args[])
{
int[] arr;
arr=new int[10];
int sum=0;
Scanner in=new Scanner(System.in);
for(int i=0;i<10;i++)
{
System.out.print("Enter the elements: ");
arr[i]=in.nextInt();
}
for(int i=0;i<10;i++)
{
sum=sum+arr[i];
}
System.out.print(sum);
}
}