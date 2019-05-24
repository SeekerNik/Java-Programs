package CollectionFramworks;

import java.util.*;

public class HashSetInJava {

	public static void main(String[] args) {
		ArrayList l1=new ArrayList();
		l1.add(345);
		l1.add("nikhil");
		//HashSet store data randomly and LinkedHashSet extends the class HashSet
		HashSet hs=new HashSet();//hashset has capacity of 16 element if not specified and load factor of.75%
		HashSet hs2=new HashSet(20,50);//cap is 20 and loadfactor is 50%
		HashSet hs3=new HashSet(l1);//cp is 20
		hs.add(34);
		hs.add("hello");
		LinkedHashSet lhs=new LinkedHashSet(hs);
		LinkedHashSet lhs2=new LinkedHashSet(l1);
		//it is used hash table and doubly linklist data structure it store data in a regular manner
		System.out.println(l1);
		System.out.println(hs);
		System.out.println(hs2);
		System.out.println(hs3);
		System.out.println(lhs);
		System.out.println(lhs2);
		
	}

}
