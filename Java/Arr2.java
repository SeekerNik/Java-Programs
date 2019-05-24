class Arr2
{
	public static void main(String []arg)
	{
		double[] val={55.6,55.8,88.45};
		for(int i=0;i<val.length;i++)
		{
			System.out.print("\nthis is the index i : "+i+" "+val[i]);
		}
		double sum=0;
		for(int i=0;i<val.length;i++)
		{
			sum=sum+val[i];
			
			
		}
		System.out.println("\n"+sum);
		double max=val[0];
		for(int i=1;i<val.length;i++)
		{
			if(max<val[i])
			{
				max=val[i];
			}
		} 
		System.out.println("\n"+max);
	}
}