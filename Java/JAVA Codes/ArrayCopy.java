import java.io.*;
import java.util.*;
public class ArrayCopy
{
	public static void main(String args[])throws Exception
	{
	int a[]=new int[]{11,9,7,27};
	int b[]=new int[]{23,5,0,0,0,0,0};
	System.arraycopy(a,0,b,1,4);	
	for(int i=0;i<b.length;i++)
	{
		System.out.print(b[i]);
	}			       	
}
}