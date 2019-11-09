package CollectionFramworks;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysClassInjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr=new int[10];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
