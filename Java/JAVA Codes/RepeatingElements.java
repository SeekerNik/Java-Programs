import java.util.*;
public class Frequency
{
public static void main(String args[])
{
int data[]={22,2,5,6,9,2,3,5};
int count[]=new int[8];
for(int i=0;i<8;i++)
{
count[i]=0;
for(int j=0;j<8;j++)
{
if(a[j]==a[i])
{
count[i]++;
}
}
}
for(int i=0;i<8;i++)
{
System.out.print(count[i]);
}
}
}