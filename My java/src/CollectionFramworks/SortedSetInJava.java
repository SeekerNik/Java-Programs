package CollectionFramworks;

import java.util.TreeSet;

public class SortedSetInJava {

	public static void main(String[] args) {
		TreeSet t1=new TreeSet();
		t1.add(55);
		t1.add(45);
		t1.add(484);
		t1.add(555);
		//t1.add("hell"); you cann't add heterogeneous objects in TreeSet and you can't add null object
		TreeSet t2=new TreeSet(t1);
		System.out.println(t1);
		System.out.println(t2);

	}

}
