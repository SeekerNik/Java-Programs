import java.util.*;
public class LinearSearch
{
public static void main(String args[])
{
int[] arr;
arr=new int[10];
Scanner in=new Scanner(System.in);
for(int i=0;i<10;i++)
{
System.out.print("Enter the elements: ");
arr[i]=in.nextInt();
}
System.out.print("Enter the element that you want to check: ");
int num=in.nextInt();
for(int i=0;i<10;i++)
{
if(arr[i]==num)
{
System.out.print("Found");
}
}
}