package FileHandling;
import java.io.*;

public class FileInputStreamInJava 
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream fin=new FileInputStream("C:\\Users\\asus\\Documents\\JavaProjects\\FileHandlingData\\Fileoutstream.txt");
		int i=0;
				while(i!=-1)
				{
					i=fin.read();
					if(i!=-1)
					System.out.print((char)i);
				}
				
				fin.close();
		
	}

}
