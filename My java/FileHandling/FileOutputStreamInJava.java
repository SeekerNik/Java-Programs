package FileHandling;
import java.io.*;
import java.util.*;

public class FileOutputStreamInJava {

	public static void main(String[] args) throws IOException 
	{
		FileOutputStream fout=new FileOutputStream("C:\\Users\\asus\\Documents\\JavaProjects\\FileHandlingData\\Fileoutstream.txt",true);
		
		String s;
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		
		
		char []arr=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			fout.write(arr[i]);
		}
		
		fout.close();
	}

}
