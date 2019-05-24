package FileHandling;
import java.io.*;
import java.util.Scanner;

public class Bufferedreader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("C:\\Users\\asus\\Documents\\JavaProjects\\FileHandlingData\\filewriter.txt");
		BufferedReader br=new BufferedReader(fr);
//		String s;
//		s=br.readLine();
//		
//		while((s=br.readLine())!=null)
//		{
//			System.out.println(s);
//		}
		char []cha=new char[200];
		br.read(cha, 10, 150);
		System.out.println(cha);
		
		br.close();
		
		
	}

}
