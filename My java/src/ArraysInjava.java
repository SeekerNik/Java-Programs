
public class ArraysInjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]; // this a reference variable of array
		arr=new int[5];
		arr[0]=23;
		arr[3]=33;
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		int i = 10;
		char arr1[]=new char[i];
		
		int arr2[]= {1,2,34,};
		
		int arr3[][]=new int[3][2];
		int arr4[][]=new int[2][];
	  //int arr[][]=new int[][2]; error
		arr4[0]=new int[3]; 
		int arr6[][]= {{1,2,3},{1,3,5}};
	}

}
