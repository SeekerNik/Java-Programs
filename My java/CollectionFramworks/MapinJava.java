package CollectionFramworks;

import java.util.*;

public class MapinJava {
public static void main(String arg[])
{
	HashMap<String,String> hm=new HashMap<String,String>();
	LinkedHashMap<String,String> khm=new LinkedHashMap<String,String>();
	Hashtable<String, String> ht=new Hashtable<String,String>();
	TreeMap<String,Integer> tm=new TreeMap<String,Integer>();
	hm.put("Nikhil", "7988206050");
	hm.put("Sahil","7983842923");
	khm.put("same", "welcome");
	ht.putAll(hm);
	tm.put("Sumit", 69699696);
	System.out.println(hm);
	System.out.println(khm);
	System.out.println(ht);
	System.out.println(tm);
	
	
}
}
