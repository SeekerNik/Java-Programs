package CollectionFramworks;

import java.util.Collections;
import java.util.Vector;

public class CollectionsClassInJava{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v1=new Vector();
		v1.add("hell wow");
		v1.add("what the fuck is it");
		System.out.println(v1);
		Collections.reverse(v1);
		System.out.println(v1);
	}

}
