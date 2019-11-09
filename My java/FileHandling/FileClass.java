package FileHandling;
import java.io.*;

public class FileClass {

	public static void main(String[] args) throws IOException 
	{
		File f1=new File("C:\\Users\\asus\\Documents\\JavaProjects\\FileHandlingData\\FileClass.txt");
		f1.createNewFile();
		System.out.println("File Name :"+f1.getName());
		System.out.println("Is the file Exists :"+f1.exists());
		System.out.println("file size :"+f1.length());
		//f1.delete();
		System.out.println("Is the file Exists :"+f1.exists());
		
	}

}
