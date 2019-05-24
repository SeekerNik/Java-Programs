package nearbyapi;

import java.net.URL;
import  java.util.*;

public class TestProgram {

	public  static void main (String  arg[])
	{
		
		try
		{
			
		String city ="chandigarh";
		URL  url  = new 	URL("https://maps.googleapis.com/maps/api/place/findplacefromtext/json?input="+city+"&inputtype=textquery&fields=photos,formatted_address,name,rating,opening_hours,geometry&key=AIzaSyBKlHPiUC0_Ezdzi0ucoNIBNcyRO77u9Vw");
		
		Scanner  in  = new Scanner(url.openStream());
		
		String res="";
		
		
		
		while(in.hasNext())
		{
			
			res=res+in.next();
			
			
		}
		
		
		System.out.println(res);
		
		
		
		
		
		
		
		}catch(Exception e){
			
		}
		
		
	}
	
	
	
	
	
	
	
}
