package FileHandling;

import java.io.*;

public class Bufferedwriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw=new FileWriter("C:\\Users\\asus\\Documents\\JavaProjects\\FileHandlingData\\filewriter.txt",true);
		BufferedWriter bf=new BufferedWriter(fw);
		bf.write("My name is NIkhil");
		bf.close();

	}

}
