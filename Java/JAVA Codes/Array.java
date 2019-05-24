public class Array
{
	public static void main(String args[])
	{
		int i;
		int[] data=new int[]{29,7,11,15,14};
		min=arr[0];
		for(i=0;i<=5;i++)
		{
			if(min<arr[i])
			{
				min=arr[i];
			}
		}
		max=arr[0];
		for(i=0;i<=5;i++)
		{
			if(max>arr[i])
			{
				max=arr[i];
			}
		}
		System.out.print("Minimum=" +min);
		System.out.print("Maximum=" +max);
		
		
	}
}